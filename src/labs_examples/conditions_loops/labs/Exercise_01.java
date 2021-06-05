package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 * <p>
 * Write a program that gets a number between 1 and 1,000,000
 * from the user and determines whether it is odd
 * or even using an if statement. Print the result.
 * <p>
 * NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // create scanner
        Scanner checkingYourNumber = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");
        // assign input to variable as int
        int yourNumber = checkingYourNumber.nextInt();

        // write completed code here

        if (yourNumber % 2 == 0) {
            System.out.println("You picked a even number.");

        } else {
            System.out.println("You picked a odd number.");
        }

    }
}
