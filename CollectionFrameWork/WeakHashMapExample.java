package CollectionFrameWork;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {

        /*
        WeakHashMap uses a weak reference for its keys this means that if a key is no longer referenced anywhere
        outside the map , then gc can automatically remove the entry
         */

        // Creating a WeakHashMap with String keys and Phone object values
        WeakHashMap<String, Phone> weakHashMap = new WeakHashMap<>();

        // Adding key-value pairs (keys are non-interned Strings(that means string are stored in heap memory not in string pool))
        weakHashMap.put(new String("Samsung"), new Phone("S24"));
        weakHashMap.put(new String("Iphone"), new Phone("16 Pro"));

        // Printing the WeakHashMap before garbage collection
        System.out.println("Before GC: " + weakHashMap);

        // Requesting garbage collection (entries may be removed if keys have no strong references)
        System.gc();

        //wait for GC process
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Printing the WeakHashMap after GC attempt
        System.out.println("After some Process (Some entries may be Cleared): " + weakHashMap);
    }
}

class Phone {
    String brand;

    // Constructor to initialize Phone object
    public Phone(String brand) {
        this.brand = brand;
    }

    // Overriding toString() to return the brand name
    @Override
    public String toString() {
        return brand;
    }
}
