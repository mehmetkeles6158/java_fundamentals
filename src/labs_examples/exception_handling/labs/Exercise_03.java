package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 * <p>
 * Demonstrate a try/catch/finally block.
 */
public class Exercise_03 {

    public static void main(String[] args) {

        String[] teams = {"Besiktas, Barcelona, Manchester City, Chelsea"};

        try {
            System.out.println(teams[5]);
        } catch (Exception exc) {
            System.out.println("Error Founded!");
        } finally {
            System.out.println("Always Execute The Program!");
        }
    }

}
