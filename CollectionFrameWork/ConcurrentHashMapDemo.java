package CollectionFrameWork;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        /*
        ConcurrentHashMap is a thread-safe version of HashMap ,It allows multiple threads to read
        and write without needing to manually synchronize code.
        Unlike Hashtable, which locks the entire map, ConcurrentHashMap achieves better performance
         by locking only portions (buckets) of the map.
         */
        /*
        , ConcurrentHashMap splits the map into segments (buckets).
        Write operations lock only a specific segment, so other segments can be accessed concurrently.
         */
        ConcurrentHashMap<Integer, String > map = new ConcurrentHashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Accessing elements
        System.out.println("Fruit at key 2: " + map.get(2));

        // Removing an element
        map.remove(1);

        // Replacing a value
        map.replace(2, "Blueberry");

        // Iterating over map
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });


    }
}
