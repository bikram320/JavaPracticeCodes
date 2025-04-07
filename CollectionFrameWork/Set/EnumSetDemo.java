package CollectionFrameWork.Set;

import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        /*
        EnumSet : it's a specialized Set implementation designed specifically for use with enum types.
        It's highly efficient and faster than HashSet for enums.
         */
        // Create an EnumSet with some colors
        EnumSet<Color> favoriteColors = EnumSet.of(Color.RED, Color.BLUE);

        // Add another color
        favoriteColors.add(Color.GREEN);

        // Print all colors in the set
        System.out.println("Favorite Colors: " + favoriteColors);

        // Check if a specific color is in the set
        if (favoriteColors.contains(Color.RED)) {
            System.out.println("You like RED!");
        }
        /*
        EnumSet is not Thread Safe
        we can achieve Thread safety by
        ->  Collections.synchronizedSet() and also have to use a Synchronized block while iterating
         */
    }
}
enum Color {
    RED, GREEN, BLUE
}
