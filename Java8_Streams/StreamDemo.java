package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        /*
        The Stream API in Java 8 is a powerful feature used to process collections of objects (like List, Set, etc.)
         in a functional and declarative style.
         ->simplifies the data processing
         ->Improve maintainability and readability
         ->Enable easy parallelism
         */
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        //counting the number of even number in list using stream
        System.out.println(list.stream().filter(x -> x%2==0).count());

        //Way of creating Stream
        //From Collection
        List<String > str = Arrays.asList("Ram","Shyam","Sita");
        Stream<String> stream = str.stream();

        //From Array
        String[] arr = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arr);

        //Using Stream.of()
        Stream<Integer> stream2 = Stream.of(1,2,3,4);

        //Infinite Stream
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(11);
        System.out.println(iterate);

    }
}
