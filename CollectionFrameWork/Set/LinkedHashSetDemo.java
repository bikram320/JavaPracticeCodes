package CollectionFrameWork.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHastSet is the collection that implements set and that maintains the insertion order of elements
        //it  does not allow duplicate elements
        //slightly slower than Hashset and only accepts one null value
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Green"); // Duplicate, won't be added

        System.out.println("LinkedHashSet elements: " + set); // Maintains insertion order

        // Functionalities
        System.out.println("Contains 'Blue'? " + set.contains("Blue"));
        set.remove("Green");

        System.out.println("Updated set: " + set);
    }
}
