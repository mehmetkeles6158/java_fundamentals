package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 * <p>
 * Demonstrate a try/catch with multiple catch statements.
 */

public class Exercise_02 {
    static int[] numbers = {11, 34, 55, 61, 58, 0};

    public static void main(String[] args) {
        someMethod(numbers);

    }


    public static void someMethod(int[] numbers) {
        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i] / numbers[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException aeExc) {
            System.out.println("Array index out of bonds");

        } catch (ArithmeticException arExc) {
            System.out.println("Divided by zero:undefined!");

        } catch (Exception exc) {
            System.out.println("Error found!");
        }
    }


}


