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

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10 :");

        // write code here

        int i = sc.nextInt();

        for ( int j = 0; j < array.length; j++ ) {
            if (array[j] == i) {
                System.out.println("This is current index " + j);
            }
        }

    }


}
