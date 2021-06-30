package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 * <p>
 * Demonstrate how to throw an exception.
 */

class Example {

    public static void main(String[] args) {
        try {
            int x = divide(21, 0);
        } catch (ArithmeticException exc) {
            System.out.println("an exception was thrown from the divide() method.");
        }
        System.out.println("all done");
    }


    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

}