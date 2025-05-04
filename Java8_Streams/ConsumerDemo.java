package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        /*
        Consumer<T> is the functional interface that represents the operation that takes
        single argument and returns no value .
        it is often used for printing , modifying or saving some kind of data that doesn't need to return
        any value
         */
        //Operation with Integer
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(7);

        //Working with list
        List<String > list = Arrays.asList("John","Joe","Joseph");

        Consumer<List<String>> consumer1 = (x) -> {
            for(String s : x ){
                System.out.println(s);
            }
        };
        consumer1.accept(list);

        //chaining Consumer with andThen()
        Consumer<String> first = (x)-> System.out.println("First : "+x);
        Consumer<String >second = (x)-> System.out.println("Second : "+x);

        first.andThen(second).accept("Hello World");
    }

}
