package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveStream {
    public static void main(String[] args) {
        /*
        Java Streams are usually object-based, meaning they work with Stream<T> like Stream<Integer>,
        Stream<Double>, etc. But that comes with autoboxing/unboxing, which adds overhead.
         Primitive Streams solve this performance problem by working directly with primitives
         (int, long, double) — without boxing them into objects.
         */
        int[] nums = {1,2,3,4,5,6,7,8,9};
        IntStream stream = Arrays.stream(nums);
        stream.filter(x->x%2==0).map(x-> x*x).forEach(System.out::println);

        // 1. Create a stream of numbers from 1 to 10 (exclusive)
        System.out.println("1. IntStream.range(1, 10):");
        IntStream.range(1,10).forEach(x-> System.out.print(x+" "));
        System.out.println("\n");

        // 2. Create a stream of numbers from 1 to 10 (inclusive)
        System.out.println("2. IntStream.rangeClosed(1, 10):");
        IntStream.rangeClosed(1,10).forEach(x-> System.out.print(x+" "));
        System.out.println("\n");

        // 3. Filter even numbers
        System.out.println("3. Even numbers:");
        IntStream.rangeClosed(1,20).filter(x->x%2==0).forEach(x-> System.out.print(x+" "));
        System.out.println("\n");

        // 4. Map to squares
        System.out.println("4. Squares of numbers:(1-5)");
        IntStream.rangeClosed(1,5)
                        .map(x->x*x)
                                .forEach(x-> System.out.print(x+" "));

        System.out.println("\n");

        // 5. Sum of numbers
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("5. Sum from 1 to 10: " + sum);

        // 6. Average
        OptionalDouble avg = IntStream.rangeClosed(1, 5).average();
        System.out.println("6. Average from 1 to 5: " + (avg.isPresent() ? avg.getAsDouble() : "N/A"));

        // 7. Max and Min
        OptionalInt max = IntStream.of(1, 22, 11, 43, 23, 54, 27, 89, 45).max();
        OptionalInt min = IntStream.of(1, 22, 11, 43, 23, 54, 27, 89, 45).min();
        System.out.println("7. Max: " + max.orElse(-1) + ", Min: " + min.orElse(-1));

        // 8. toArray()
        System.out.println("8. Using toArray():");
        int[] array = IntStream.of(1, 2, 3, 4, 5, 6, 7).toArray();
        System.out.println(Arrays.toString(array));

        // 9. boxed() to convert to Stream<Integer>
        System.out.println("9. Using boxed() and collecting to List<Integer>:");
        List<Integer> collect = IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());
        System.out.println(collect);

        // 10. Reduce (sum of squares of odd numbers)
        int reduce = IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 != 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println("10. Sum of squares of odd numbers:(1-10) " + reduce);

    }
}
