package CollectionFrameWork;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        /*
        In a HashMap, the hash code is generated based on the content of the key.
        When checking equality of keys, it compares the key's content, not its memory address.
        This can lead to overwriting entries if two keys have the same content.
         */
        HashMap<String, String> hashMap = new HashMap<>();

        /* Creating two different String objects with the same content.
         These two objects will have the same hashcode because their content is the same.
         */
        String key1 = new String("key");
        String key2 = new String("key");

        // Adding the keys with values to the HashMap
        hashMap.put(key1, "One");
        hashMap.put(key2, "Two");

        /* Print the HashMap. The second key-value pair will overwrite the first one
         because HashMap checks equality by content, and the keys have the same content.
         */
        System.out.println(hashMap);

        /*
        In IdentityHashMap, the hashcode is generated based on the memory address of the key.
        When checking equality of keys, it compares the memory address (reference) of the keys,
        not their content. This means that two keys with the same content will still be treated as different.
         */
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();

        /*Creating two different String objects with the same content.
        These objects will have different memory addresses (references).
         */
        String s1 = new String("key1");
        String s2 = new String("key1");

        // Adding the keys with values to the IdentityHashMap
        identityHashMap.put(s1, 1);
        identityHashMap.put(s2, 2);

        /* Print the IdentityHashMap. Both entries will be retained as different keys
         because IdentityHashMap checks keys by their memory address, not their content.
         */
        System.out.println(identityHashMap);
    }
}
