package CollectionFrameWork.Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        /*
        ConcurrentSkipListMap is a thread-safe, sorted map .
        Implements ConcurrentNavigableMap interface.
        Maintains keys in sorted (ascending) order.
        Uses a skip list data structure (instead of red-black tree like TreeMap).
        Is concurrent — multiple threads can safely access it without external synchronization.
         */
        ConcurrentSkipListMap<String, Integer> scores = new ConcurrentSkipListMap<>();

        scores.put("Alice", 85);
        scores.put("Charlie", 78);
        scores.put("Bob", 90);

        // Sorted output by key
        scores.forEach((name, score) ->
                System.out.println(name + ": " + score)
        );
    }
}
