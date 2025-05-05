package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        /*
        this program elaborates the lazy performance of intermediate operation
         */
        //Create a list of some names
        List<String> list = Arrays.asList("Bikram","Cris","Leo","Kevin");

        Stream<String> stringStream = list.stream()
                .filter(x -> {
                    //this will not print before terminal operation is invoker
                    System.out.println("name : " + x);
                    return x.length() > 3;
                });

        //this statement will print first cause above one is only intermediate operation
        //so to be executed it must need terminal operation to be invoked
        System.out.println("Before Terminal Operation");

        //after this terminal operation  above Stream statement will be executed
        List<String> collect = stringStream.collect(Collectors.toList());

        System.out.println("After Terminal Operation ");
        System.out.println(collect);
    }
}
