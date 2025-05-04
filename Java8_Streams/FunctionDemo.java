package Java8_Streams;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        /*
        Function is the Functional interface introduced in java 8
        It allows you to pass logic as data — that is, you can write behavior
        (like a lambda or method) and give it to methods as arguments.
        function<t,r> -> t represent the input DataType and r represent Result Data Type
         */
        Function<Integer,Integer> calc = x -> x*2 ;
        System.out.println(calc.apply(12)); // return 24

        Function<Integer,Integer> anotherCalc = x -> x * 3;
        System.out.println(anotherCalc.apply(12));//return 36

        //using method like .andThen and .Composed
        System.out.println(calc.andThen(anotherCalc).apply(12));
        // this will calculate the operation of calc first and then calculate the operation of another calc

        System.out.println(calc.compose(anotherCalc).apply(10));
        //this will calculate the operation inside the Compose Argument and then another operation of calc

        //identity is the method in the Function return the exactly same value as input
        Function<String , String > identity = Function.identity();
        System.out.println(identity.apply("String"));


    }
}
