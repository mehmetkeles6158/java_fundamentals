package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 * <p>
 * Demonstrate throwing an exception in one method and catching it in another method.
 */

public class Exercise_06 {
    public static void main(String[] args) {
        try {
            methodOne();
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught!");
            exc.printStackTrace();
            System.out.println(exc.getMessage());
        }
    }

    public static void methodOne() throws ArithmeticException {

        methodTwo();
    }


    public static void methodTwo() throws ArithmeticException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 0};
        try {
            int x = numbers[5] / numbers[6];
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught in methodTwo!");
            System.out.println("Now manually throwing exception back to methodOne!");
            throw exc;
        }
    }
}

