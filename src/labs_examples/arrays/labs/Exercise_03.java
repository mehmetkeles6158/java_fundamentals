package labs_examples.arrays.labs;

/**
 * 2D Array
 * <p>
 * Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 * <p>
 * The output should look something like this:
 * <p>
 * 3 6 9 12 15
 * 18 21 24 27 30
 * ...
 * ...
 * ...
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] multiplyByThree = new int[5][5];

        for (int i = 1; i < multiplyByThree.length; i++) {
            for (int j = 1; j < multiplyByThree[i].length; j++) {
                multiplyByThree[i][j] = i * j * 3;
            }
        }

        for (int[] vals : multiplyByThree) {
            for (int i : vals) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

    }
}
