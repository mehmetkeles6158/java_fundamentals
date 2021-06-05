package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 * <p>
 * Take in a number from the user and print "January", "February", ... "December", or "Other"
 * if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 */

public class Exercise_03 {
    public static void main(String[] args) {

        // 1) I create a scanner first!
        Scanner months = new Scanner(System.in);
        // 2) I prompt user secondly!
        System.out.print("Put your numbers (1-12,inclusive) here for your months: ");
        // 3) I assign input to variable as int
        int num = months.nextInt();
        // 4) I write completed code here!

        switch (num) {
            case 1:
                System.out.println("Your month is January!");
                break;
            case 2:
                System.out.println("Your month is February!");
                break;
            case 3:
                System.out.println("Your month is March!");
                break;
            case 4:
                System.out.println("Your month is April!");
                break;
            case 5:
                System.out.println("Your month is May!");
                break;
            case 6:
                System.out.println("Your month is June!");
                break;
            case 7:
                System.out.println("Your month is July!");
                break;
            case 8:
                System.out.println("Your month is August!");
                break;
            case 9:
                System.out.println("Your month is September!");
                break;
            case 10:
                System.out.println("Your month is October!");
                break;
            case 11:
                System.out.println("Your month is November!");
                break;
            case 12:
                System.out.println("Your month is December!");
                break;
            default:
                System.out.println("you hit default!");

        }


    }

}
