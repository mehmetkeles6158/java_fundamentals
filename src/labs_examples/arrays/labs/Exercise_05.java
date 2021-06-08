package labs_examples.arrays.labs;

/**
 * Traversing Arrays Backwards
 * <p>
 * Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 * element in the array in reverse order.
 */

public class Exercise_05 {

    public static void main(String[] args) {
        int[] yearsOfBesiktas = new int[]{2003, 2009, 2015, 2016, 2021};

        for (int i = yearsOfBesiktas.length - 1; i >= 0; i--) {
            System.out.print(yearsOfBesiktas[i] + " ");
        }

    }
}


