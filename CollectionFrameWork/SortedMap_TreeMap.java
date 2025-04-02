package CollectionFrameWork;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_TreeMap {
    public static void main(String[] args) {
        /*
            SortedMap is an interface that extends Map and guarantees that
            the entries are sorted based on the key , either in natural ordering
            or by a specific comparator
         */
        // we can pass comparator in treemap constructor
        SortedMap<Integer , String > sortedMap = new TreeMap<>();
        sortedMap.put(1,"Joe");
        sortedMap.put(5,"John");
        sortedMap.put(3,"Daniel");
        sortedMap.put(9,"Cris");
        sortedMap.put(7,"Dev");

        // Printing the sorted map (Keys will be in sorted order)
        System.out.println("SortedMap: " + sortedMap);

        //Different method of it
        // Accessing first and last keys
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());

        // Getting a subMap
        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 5);
        System.out.println("SubMap (2 to 5): " + subMap);

        // Getting headMap (keys < 3)
        System.out.println("HeadMap (<3): " + sortedMap.headMap(3));

        // Getting tailMap (keys >= 3)
        System.out.println("TailMap (>=3): " + sortedMap.tailMap(3));
    }
}
