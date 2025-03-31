package CollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[]args){

        /*
        LinkedHashMap is kind of hash map that maintains the order by using the doubly linked list in every entry
         */
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(3,0.75f,true);
        map.put(1,"Bikram");
        map.put(2,"Joe");
        map.put(3,"John");
        map.put(4,"Andrew");

        map.get(1);
        /*
        if we put accessOrder as true ,then it will print the map in access order
        otherwise it will print the map in insertion order
         */

        for (Map.Entry<Integer,String> Entry : map.entrySet()){
            System.out.println(Entry);
        }
        // Accessing a value
        System.out.println("Value for key 1: " + map.get(1));

        // Removing an element
        map.remove(1);

        // Displaying after deletion
        System.out.println("After removal: " + map);

    }
}
