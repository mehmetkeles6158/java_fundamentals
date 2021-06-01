package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 * <p>
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b) {
            System.out.println("a is less than b");
        }

        // write your code below
        int m = 11;
        int n = 9;
        if (m > n) {
            System.out.println("m is greater than n");
        }

        int k = 21;
        int l = 21;
        if (k >= n) {
            System.out.println("k is greater than or equal to l");
        }

        int d = 13;
        int e = 15;
        if (k <= n) {
            System.out.println("m is less than or equal to e");
        }

        int x = 10;
        int y = 10;
        if (x == y) {
            System.out.println("k is equal to z");
        }

    }


}

