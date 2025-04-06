package CollectionFrameWork;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        /*
         an ImmutableMap is a type of Map that cannot be modified after it is created.
         This means no entries can be added, removed, or updated.
         Immutable maps are especially  useful in multithreaded environments,
         or anywhere you want to ensure data consistency.
         */
        //way to implement ImmutableMap before java 9
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Leo");
        map.put(2,"Cris");
        map.put(3,"Kevin");
        Map<Integer, String> map1 = Collections.unmodifiableMap(map);
        //if I try to do any kind of operation with this map then it will throw an exception
        //eg; map.put(4,"Junior");
        System.out.println(map1);

        //way to implement ImmutableMap After java 9
        Map<Integer,String> map2 = Map.of(1,"Bikram",2,"Cris");
        //Limitation of Map.of is that it can only hold upto 10 pair of Key and values
        //and, it also throws exception if try to modify it
        System.out.println(map2);
        //another way to implement Immutable Map to overcome the limitation of Map.of()
        Map<Integer,String> map3 = Map.ofEntries(Map.entry(1,"DSA"),Map.entry(2,"Java"));
        /*
        Map.ofEntries is a method to implement the Immutable Map to overcome the limitation of
        Map.of() , that it can hold more than 10 pairs of keys and values
         */
        System.out.println(map3);

    }
}
