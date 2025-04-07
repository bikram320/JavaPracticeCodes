package CollectionFrameWork.Set;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        /*
        CopyOnWriteArraySet is a thread-safe variant of Set in Java
        -> Internally, it uses a CopyOnWriteArrayList to store its elements.
        ->ThreadSafe
        ->Iterator do not reflect modification
        ->It is safe to use in concurrent environments where read operations are more frequent than write operations.
         */
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Leo");
        set.add("Cris");
        set.add("Junior");

        for(String setIterate : set){
            System.out.println(setIterate);
            /*
            it will not reflect the modified one, cause it create a copy of set and
            when iteration is completed then it is replaced with the Main set.
            If we used ConcurrentSkipListSet and modified the set then Iterator will reflect the modification
             */
            set.add("Kevin");
        }
        //after ,iteration it will reflect the Modified value as well
        System.out.println(set);

    }
}
