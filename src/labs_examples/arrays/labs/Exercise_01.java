package labs_examples.arrays.labs;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_01 {
    public static void main(String[] args) {
        // I created a scanner first!
        Scanner nums = new Scanner(System.in);
        // prompt it .
        System.out.println("Enter your elements of your array here:");
        //Initialize array with size of array
        int[] yourArray = new int[10];
        int sum = 0;
        int average = 0;
        //I write my code here
        for (int i = 0; i < 10; i++) {
            yourArray[i] = nums.nextInt();
            sum = sum + yourArray[i];
            average = sum / yourArray.length;
        }
        System.out.println("Elements of the array are: " + Arrays.toString(yourArray));
        System.out.println("Sum of the elements of your array :" + sum);
        System.out.println("Average of your array :" + average);
    }


}