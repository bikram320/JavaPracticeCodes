package CollectionFrameWork;


import java.util.Stack;

public class StackInJava {
    public static void main(String[]args){

        Stack<Integer> stack = new Stack<>();
        //Adding Elements into a stack
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        //Removing elements from the stack(Remove from the top of Stack);
        stack.pop(); //15
        stack.pop(); //14

        //checking the stack is empty or not
        System.out.println(stack.isEmpty());

        // Displaying Element of Stack
        System.out.println(stack); //[10,11,12,13]




    }
}
