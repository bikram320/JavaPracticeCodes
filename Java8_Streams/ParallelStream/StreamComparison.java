package Java8_Streams.ParallelStream;

import java.util.List;
import java.util.stream.Stream;

public class StreamComparison {
    public static void main(String[] args) {
        /*
        let's compare the working speed of stream and parallel stream in big data
        as per the data increases parallel Stream became better than  sequential stream
         */
        List<Integer> list = Stream.iterate(1,x->x+1).limit(100000).toList();
        long startTime = System.currentTimeMillis();
        List<Long> factorialList = list.parallelStream().map(StreamComparison::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken by Parallel Stream : "+(endTime-startTime));

        //Doing Same
        long sTime = System.currentTimeMillis();
        List<Long> factorialList1 = list.stream().map(StreamComparison::factorial).toList();
        long eTime = System.currentTimeMillis();
        System.out.println("Time Taken by sequential Stream : "+(eTime-sTime));
    }
    public static long factorial(int n ){
        long res = 1;
        for(int i=2; i<=n; i++){
            res*=i;
        }
        return res;
    }
}
