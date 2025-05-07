package Java8_Streams;

import java.util.*;
import java.util.stream.Collectors;


public class CollectorsDemo {
    public static void main(String[] args) {
        /*
         collectors are used to accumulate elements of a stream into a summary result,
         such as a list, set, map, or even a single value. Collectors are part of the java.util.stream.
         Collectors utility class and are most commonly used with the collect() terminal operation.
         */
        //-> collecting to a List
        List<String> names = Arrays.asList("Bikram","Cris","Leo","kevin");
        List<String> res = names.stream()
                .filter(x -> x.startsWith("C"))
                .collect(Collectors.toList());
        System.out.println(res);

        //-> Collecting to a Set
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,6,7);
        Set<Integer> collect = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(collect);

        //-> Collecting to Specific Collector
        //Transform to any Collection
        ArrayList<String> collect1 = names.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));

        //-> joining Strings
        //-> Concatenates stream elements into a single String
        String collect2 = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(collect2);

        // Summarizing Data
        //Generate Statistical Summary(min,max,avg)
        List<Integer> list = Arrays.asList(1,2,33,11,22,43,101);
        IntSummaryStatistics collect3 = list.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count : "+collect3.getCount());
        System.out.println("Max : "+collect3.getMax());
        System.out.println("Min : "+collect3.getMin());
        System.out.println("Average : "+collect3.getAverage());
        System.out.println("Sum : "+collect3.getSum());

        //Doing Summarizing task Directly
        Double collect4 = list.stream().collect(Collectors.averagingDouble(x -> x));
        System.out.println(collect4);
        Long collect5 = list.stream().collect(Collectors.counting());
        System.out.println(collect5);

        //-> Grouping Elements
        List<String> words = Arrays.asList("Hey","This","is","Bikram","Learn","and","do","code","in","Java");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));

        //-> partitioning elements
        //--> partitions elements into two groups(false and true) based on predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length()>5)));

        //-> Mapping function before collecting
        //--> it is short-cut method to implement .map method without explicitly using it we can directly , use it in collect before collectors
        List<String> collect6 = words.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
        System.out.println(collect6);
    }
}
