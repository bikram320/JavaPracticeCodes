package Java8_Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        /*
         method reference is a shorthand notation of a lambda expression to call a method.
         It's a compact and readable way to refer to methods or constructors using the :: operator.
         */
        Consumer<String> consumer = DemoReference::printMsg;
        consumer.accept("Hello From Static method ");

        //another example in list
        List<String> list = Arrays.asList("Apple ","Banana","Orange");

        // Equivalent to: list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

    }
}
class DemoReference{
    public static void printMsg(String msg){
        System.out.println(msg);
    }
}
