package Java8_Streams;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
        //Some Task to work with Streams

        //Squaring and sorting values
        List<Integer> list = Arrays.asList(1,2,9,4,3,11,7,5,8);
        System.out.println("Elements are Squared and Sorted : ");
        List<Integer> list1 = list.stream().map(x -> x * x).sorted().toList();
        System.out.println(list1);

        //Filtering and collecting
        System.out.println("Displaying Odd numbers by filtering and collecting");
        List<Integer> list2 = list.stream().filter(x -> x % 2 != 0).toList();
        System.out.println(list2);

        //Summing up elements
        System.out.println("Sum the Values in list");
        System.out.println(list.stream().reduce(Integer::sum).get());


        //Counting Occurrences of Character
        String word = "HelloWorldThisIsBikram";
        System.out.println(word.chars().filter(x->x=='l').count());
    }
}
