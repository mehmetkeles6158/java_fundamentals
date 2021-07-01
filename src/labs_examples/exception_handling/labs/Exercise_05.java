package labs_examples.exception_handling.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exception Handling Exercise 5:
 * <p>
 * Demonstrate how to throw an exception.
 */

class Example {

    public static void main(String[] args) {

        System.out.println("Welcome to the School Registration process!!");
        checkEligibilty(13, 160);
        System.out.println("Have a good day...");

    }

    public static void checkEligibilty(int age, int height) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        age = input.nextInt();

        System.out.println("What is your height as metric unit(cm)?");
        height = input.nextInt();

        if (age > 10 || height > 140) {
            throw new ArithmeticException("You are not not eligible for registration!");

        } else {
            System.out.println("Entry is Valid!!");
        }
    }

}