package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[]args){

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.addLast(18);

        System.out.println("list At first :");
        for(int num : list){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("list after Removing The first Value :");
        // .removeFirst will delete the value from the first index int the list
        list.removeFirst();
        for(int num : list){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("list after Removing the Last value : ");
        // .removeLast will delete the value from the last index in the list
        list.removeLast();
        for(int num : list){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("List After Replacing the the value in index 1 :");
        //.set will replace the value of given index
        list.set(1,20);
        for(int num : list){
            System.out.print(num+" ");
        }
        System.out.println();


    }
}
