package CollectionFrameWork.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ThreadSafeSet {
    public static void main(String[] args) {
        /*
        Thread safety in a Set in Java (or in general programming) refers to whether a Set can be safely accessed and
        modified by multiple threads simultaneously, without corrupting the data or causing unexpected behavior.
         */
        //Different Way to Achieve a Thread Safety in Set
        // -> using Collections.synchronizedSet()
        Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
        syncSet.add(1);
        syncSet.add(2);
        // in this type we have to use Synchronized block while iterating over a Elements
        synchronized (syncSet){
            for(int i : syncSet){
                System.out.println(i);
            }
        }
        /*
        Another way to achieve Thread safety in set
        -> using ConcurrentSkipListSet
        ->Thread-safe and sorted.
        ->Backed by a ConcurrentSkipListMap.
        ->Suitable for concurrent applications needing ordering.
        */
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("DSA");
        set.add("Web ");
        set.add("BackEnd");
        //we don't have to use synchronized block while iteration
        for(String set1 : set){
            System.out.println(set1);
        }

    }
}
