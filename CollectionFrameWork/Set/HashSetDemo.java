package CollectionFrameWork.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //Set is collection that does not allow duplicate elements
        //Faster Operation -> O(1)
        //order is not maintained in hashSet

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);//this is disallowed and only one will be show

        System.out.println(set);

        //some methods

        System.out.println(set.contains(3));
        System.out.println(set.remove(1));
        System.out.println(set.isEmpty());
        for(int i : set){
            System.out.println(i);
        }

    }
}
