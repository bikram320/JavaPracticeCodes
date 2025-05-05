package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOps {
    public static void main(String[] args) {
        /*
        In Java Streams, terminal operations are the final operations in a stream pipeline that trigger
         the processing of the stream and produce a result or a side effect.
         Once a terminal operation is invoked, the stream is considered consumed and can’t be reused.
         */
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        //-> Collect = Converts the stream into a collection or another form.
        System.out.println("Collect Demo");
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //-> ForEach = Performs an action for each element in the stream.
        System.out.println("ForEach Demo ");
        list.stream().filter(x -> x%2!=0).forEach(System.out::print);

        //->Reduce = Combines the element into single unit (eg. sum , multiplication)
        System.out.println("\nReduce Demo");
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

        //-> Count = Returns the number of elements.
        System.out.println("Count Demo ");
        System.out.println(list.stream().count());

        //-> anyMatch(), allMatch(), noneMatch() = Return boolean values based on conditions.
        System.out.println("AnyMatch Demo");
        //returns true if any of the elements matches the condition
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        System.out.println("AllMatch Demo");
        //returns true if only all  the elements matches the condition
        boolean b1 = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(b1);

        System.out.println("NoneMatch Demo");
        //returns true if none of the elements matches the condition
        boolean b2 = list.stream().noneMatch(x-> x<0);
        System.out.println(b2);

        //-> findFirst() / findAny = Returns an Optional describing some element of the stream.
        System.out.println("Find First ");
        System.out.println(list.stream().findFirst().get());
        System.out.println("Find Any ");
        System.out.println(list.stream().findAny().get());
    }
}
