package Java8_Streams;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiVersion {
    public static void main(String[] args) {
        /*
        BiPredicate is the functional interface that accepts two arguments
        which is used for comparing
         */
        BiPredicate<Integer,Integer> isSumEven = (x,y)-> (x+y)%2==0;
        System.out.println(isSumEven.test(2,4));

        /*
        BiFunction is the interface or Bi version of Function that performs some operation on
        two values
         */
        BiFunction<String,String,Integer> StringLength  = (x,y) -> (x+y).length();
        System.out.println(StringLength.apply("Bikram","Bishwokarma"));

        /*
        BiConsumer is the interface or Bi Version of Consumer that takes two input as argument
        and returns no value
         */
        BiConsumer<String, Integer> printAge = (name, age) ->
                System.out.println(name + " is " + age + " years old.");

        printAge.accept("Bikram ",19);


    }
}
