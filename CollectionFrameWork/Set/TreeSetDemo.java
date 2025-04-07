package CollectionFrameWork.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //TreeSet is a Collection that implements Set and that store elements in sorted manner
        //does not allow duplicate and null values at all
        //slower than hashset and linkedHashSet -> O(log(n))

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(5);
        set.add(20);
        set.add(10); // Duplicate, won't be added

        System.out.println("TreeSet elements (sorted): " + set); // Sorted order

        // Functionalities
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        set.remove(5);
        System.out.println("After removing 5: " + set);
    }
}
