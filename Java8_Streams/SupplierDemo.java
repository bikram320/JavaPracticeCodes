package Java8_Streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

    /*
     a Supplier<T> is a functional interface in the java.util.function package that represents
     a supplier of results. It takes no input and returns a result of type T.
     */
        Supplier<String> giveHelloWorld = () -> "HelloWorld";
        System.out.println(giveHelloWorld.get());

        //combined Example
        Predicate<Integer > predicate = (x) -> x%2==0;
        Function<Integer,Integer> function = (x) -> x * x ;
        Consumer<Integer> consumer = x ->System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
        //In above example it first check supplier.get() which is 100 , in predicate that checks it is even
        // or not if it returns true then , consumer will accept the operation result of function .apply
        // that is applying supplier.get i.e 100 as a operation so , result will be 100 * 100
    }

}
