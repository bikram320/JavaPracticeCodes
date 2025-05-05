package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOps {
    public static void main(String[] args) {
        /*
        In Java Streams, intermediate operations are operations that transform a stream into another stream.
        They are lazy, meaning they don't process the elements until a terminal operation is invoked.
         These are used to filter, map, or sort elements in a pipeline.

         ->Streams are designed for performance and composability .
         Intermediate operations only define what to do, but nothing happens until
         you say "now do it" with a terminal operation
         */
        //->Filter = Filters elements based on a condition (predicate)
        System.out.println("Filter Demo");
        List<String> list = Arrays.asList("Joe","John","Andrew ","Bikram ","Cris","Leo","Joe");
        long j = list.stream().filter(x -> x.startsWith("J")).count();
        System.out.println(j);

        //->Map = Transforms each element using a function
        System.out.println("Map Demo");
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        stringStream.forEach(System.out::println);

        //->Sorted = Sort the elements
        System.out.println("Sorted Demo");
        System.out.println("1.Normal sorting");
        Stream<String> sorted = list.stream().sorted();
        sorted.forEach(System.out::println);
        System.out.println("2.Sorting with Custom Comparator");
        Stream<String> sortedWithCustomComparator = list.stream().sorted((a, b) -> a.length() - b.length());
        sortedWithCustomComparator.forEach(System.out::println);

        //Distinct = Removes duplicate elements
        System.out.println("Distinct Demo");
        Stream<String> distinct = list.stream().distinct();
        distinct.forEach(System.out::println);

        //Limit = 	Limits the number of elements to n
        System.out.println("Limit Demo");
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).limit(10);
        limit.forEach(System.out::print);

        //Skip = Skip the first n elements
        System.out.println("\nSkip Demo");
        Stream<Integer> skip = Stream.iterate(1, x -> x + 1).skip(3).limit(10);
        skip.forEach(System.out::print);


    }
}
