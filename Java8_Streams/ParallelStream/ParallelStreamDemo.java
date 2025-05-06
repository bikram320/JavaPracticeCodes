package Java8_Streams.ParallelStream;


import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        /*
        A type of Stream that enables parallel processing of elements , Allowing multiple threads to
        process parts of the Stream simultaneously , significantly improve the performance for large datasets
        A version of Stream that uses multiple threads to process data in parallel.
        Ordering is Not guaranteed — be careful if order matters.
         */
        long startTime = System.currentTimeMillis();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list1 = list.parallelStream().filter(x -> x % 2 == 0).toList();
        System.out.println(list1);
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken by parallel Stream : "+(endTime-startTime)+" ms");

        //In output We can see that parallel Stream is Taking less time than normal Stream

        //Doing Same Task by Stream
        long sTime = System.currentTimeMillis();
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list3 = list2.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list3);
        long eTime = System.currentTimeMillis();
        System.out.println("Total Time Taken by Sequential (normal) Stream : "+(eTime-sTime)+" ms");
    }
}
