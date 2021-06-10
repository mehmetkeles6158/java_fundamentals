package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 * <p>
 * Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 * if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 * to accomplish this task.
 * <p>
 * Bonus Tricky Challenge: Use a "nested-if" statement.
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner days = new Scanner(System.in);
        // 2) prompt user
        System.out.print("Put your numbers 1-7 here for your days: ");
        // 3) assign input to variable as int
        int number = days.nextInt();
        // 4) write completed code here
        if (number == 1) {
            System.out.println("Your Day is Monday");
        } else if (number == 2) {
            System.out.println("Your Day is Tuesday");
        } else if (number == 3) {
            System.out.println("Your Day is Wednesday");
        } else if (number == 4) {
            System.out.println("Your Day is Thursday");
        } else if (number == 5) {
            System.out.println("Your Day is Friday");
        } else if (number == 6) {
            System.out.println("Your Day is Saturday");
        } else if( number==7){
            System.out.println("Your Day is Sunday");
        } else if (number < 1 && number > 7){
        }

    }
}
