package labs_examples.arrays.labs;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

/**
 * Irregular Arrays
 * <p>
 * Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 * "for-each" loop, iterate and print out each element of the array.
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int[][] arr = new int[2][2];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = i * j * 10;
            }
        }

        for (int[] vals : arr) {
            for (int i : vals) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

}
