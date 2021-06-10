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

        int[][] multipleOfThree = new int[5][5];

        int count = 3;

        for (int i = 0; i < multipleOfThree.length; i++) {
            for (int j = 0; j < multipleOfThree[i].length; j++) {
                multipleOfThree[i][j] = count;
                count = count + 3;
                System.out.print(multipleOfThree[i][j] + " ");

            }
            System.out.println();
        }


    }

}

