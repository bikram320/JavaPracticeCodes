package Java8_Streams;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        /*
        predicate -> functional interface ( boolean valued function) that have,Abstract method Boolean Test()
        it only holds the condition and returns boolean value
        it can be used for checking any type of condition like oddOrEven or in String
         */
        // checking if number is even or not by using predicate
        Predicate<Integer> isEven = n -> n%2==0 ;
        System.out.println(isEven.test(2)); // it returns true if condition satisfied else returns false

        // working with Strings
        Predicate<String > isStartWithB = x -> x.toLowerCase().startsWith("b"); // checking if String start with A or not
        System.out.println(isStartWithB.test("Bikram"));

        Predicate<String> isEndWithM = x -> x.toLowerCase().endsWith("m");
        System.out.println(isEndWithM.test("Bikram"));

        Predicate<String> isStartWithBAndEndWithM = isStartWithB.and(isEndWithM);
        System.out.println(isStartWithBAndEndWithM.test("Cristiano"));
    }
}
