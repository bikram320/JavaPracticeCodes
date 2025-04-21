package CollectionFrameWork.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        /*
        Deque is the interface in java .util package that stands double ended queue that enables the insertion
        and deletion of elements from both side, it can be used as Queue , Stack etc
        it is implemented by Arraydeque and linked list
         */
        /*
        ArrayDeque is the class that implements Deque , it uses Dynamic Circular array enabling faster insertion
        and deletion
        -> faster insertion
        -> less memory
        -> No null
         */
        Deque<Integer> queue = new ArrayDeque<>();

        //adding elements
        queue.addFirst(10);
        queue.addLast(20);
        queue.offerFirst(5);
        queue.offerLast(25);

        System.out.println(queue); // -> 5,10,20,25
        System.out.println(queue.getFirst()); //-> 5
        System.out.println(queue.pollFirst());// -> 5

        for(int num : queue){
            System.out.println(num);
        }

    }
}
