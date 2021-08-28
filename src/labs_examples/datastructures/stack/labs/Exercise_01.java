package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack();

        myStack.push(1);
        myStack.push(19);
        myStack.push(190);
        myStack.push(1903);
        System.out.println(myStack);

        int x = myStack.pop();
        System.out.println(x);

        System.out.println(myStack);

       int y = myStack.peek();
        System.out.println(y);

        Boolean check = myStack.empty();
        System.out.println(check);

        System.out.println( myStack.search(1));

    }
}