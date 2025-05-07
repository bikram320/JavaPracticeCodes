package Java8_Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {

        //Example 1 : Collecting names by length
        List<String> list = Arrays.asList("Bikram","Andrew","Joe","John");
        System.out.println(list.stream().collect(Collectors.groupingBy(x->x.length())));

        //Example 2 : Counting Word by Occurences
        String Word = "Hello World , Stream is so Great , i recommend you to learn it once if you learn java ";
        System.out.println(Arrays.stream(Word.split(" ")).collect(Collectors.groupingBy( x -> x , Collectors.counting())));

        //Example 3 : partitioning Even and Odd numbers
        List<Integer> list2 = Arrays.asList(1,2,3,1,2,3,444,23,23,22,45);
        System.out.println(list2.stream().collect(Collectors.partitioningBy(x -> x%2==0)));

        //Summing values in a Map
        Map<String ,Integer> items = new HashMap<>();
        items.put("Apple",4);
        items.put("Banana",3);
        items.put("Orange",5);
        System.out.println(items.values().stream().reduce(Integer::sum));

        //Example 5 : Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple","Banana","Orange");
        System.out.println(fruits.stream().collect(Collectors.toMap(String::toUpperCase, String::length)));

    }
}
