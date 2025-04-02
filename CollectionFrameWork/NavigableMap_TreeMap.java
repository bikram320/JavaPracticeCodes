package CollectionFrameWork;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap_TreeMap {
    public static void main(String[] args) {
        /*
                NavigableMap is an extension of SortedMap that provides
                additional navigation methods to find entries before or after a given key.
                The most commonly used implementation of NavigableMap is TreeMap.
         */
        // Creating a NavigableMap using TreeMap
        NavigableMap<Integer, String> navMap = new TreeMap<>();

        // Adding key-value pairs
        navMap.put(1, "Apple");
        navMap.put(3, "Banana");
        navMap.put(5, "Cherry");
        navMap.put(7, "Mango");
        navMap.put(9, "Peach");

        // Printing the sorted NavigableMap
        System.out.println("NavigableMap: " + navMap);

        // Getting the closest lower and higher keys
        System.out.println("Lower Key (just before 5): " + navMap.lowerKey(5));
        System.out.println("Higher Key (just after 5): " + navMap.higherKey(5));

        // Getting the closest equal or lower/higher keys
        System.out.println("Floor Key (<= 5): " + navMap.floorKey(5));
        System.out.println("Ceiling Key (>= 5): " + navMap.ceilingKey(5));

        // Polling (removing first and last entries)
        System.out.println("Poll First Entry: " + navMap.pollFirstEntry());
        System.out.println("Poll Last Entry: " + navMap.pollLastEntry());

        // Navigating in descending order
        System.out.println("Descending Map: " + navMap.descendingMap());
    }
}
