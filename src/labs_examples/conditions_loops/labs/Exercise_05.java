package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 * <p>
 * Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 * of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 * Print the results to the console.
 * <p>
 * For example, if a user enters 1 and 100, the output should be:
 * <p>
 * The sum is: 5050
 * The average is: 50.5
 */

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter lower bound:");
        int lowerBound = user.nextInt();

        System.out.print("Enter upper bound:");
        int upperBound = user.nextInt();


        int sum = 0;
        double average = 0;

        for (int i = lowerBound; i <= upperBound; i++) {

            sum += i;

        }
        System.out.println("Sum is " + sum);
        average = (double)sum/(upperBound-lowerBound + 1);
        System.out.println("The average is " + average);

    }


}






