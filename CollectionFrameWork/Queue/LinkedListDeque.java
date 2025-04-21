package CollectionFrameWork.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDeque {
    public static void main(String[] args) {
        /*
        LinkedList Deque is the implementation of Deque interface that uses doubly Linked List
        it if generally slower , uses more memory and accepts null value
         */
        Deque<String > deque = new LinkedList<>();
        //adding elements
        deque.addFirst("Leo");
        deque.addLast("John");
        deque.offerFirst("Cris");

        System.out.println(deque);

        //removing elements
        deque.pollLast();

        System.out.println(deque.getFirst());

        System.out.println(deque);
    }
}
