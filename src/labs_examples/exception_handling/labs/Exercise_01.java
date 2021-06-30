package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 * <p>
 * 1) Demonstrate a try/catch.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        String[] names = {"Mehmet", "Akif", "Keles"};

        try {
            System.out.println(names[4]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Error Found!");
        }

        System.out.println("Program Completed!");
    }

}

