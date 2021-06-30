package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 * <p>
 * Demonstrate a nested try/catch.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        int[] nums = {10, 24, 45, 68, 86, 0};

        try {
            System.out.println(nums[7]);
        } catch (ArrayIndexOutOfBoundsException aeExc) {
            System.out.println("First, There is ArrayIndexOutOfBounds Error!");
            try {
                System.out.println(nums[3] / nums[5]);
            } catch (ArithmeticException arExc) {
                System.out.println("Second, There is ArithmeticException Error!");
            }
        }

    }
}
