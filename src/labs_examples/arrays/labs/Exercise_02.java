package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * More labs_examples.arrays
 * <p>
 * Using the array below, take in a number from 1-10 from the user and print out the index of that
 * element.
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner index = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10 :");

        // write code here

        int i = index.nextInt();

        i = array[i];
        array[i] = array.length - 1;
        System.out.println(i + " is index number of element " + array[i]);

    }


}
