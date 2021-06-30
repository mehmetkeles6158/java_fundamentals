package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 * <p>
 * 1) Create a custom exception.
 * 2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 {


    public static void main(String[] args) {
        try {
            changePlayer();
        } catch (MaxSubPlayer maxSubs) {
            System.out.println(maxSubs.toString());
        }

    }

    public static class MaxSubPlayer extends Exception {
        @Override
        public String toString() {
            return "MaxSubPlayer{Sorry! You can only make maximum 3 player' changes during the game!}";
        }
    }

    public static void changePlayer() throws MaxSubPlayer {
        Scanner input = new Scanner(System.in);

        System.out.println("How many players do you want to change?");
        int response = input.nextInt();
        if (response < 4) {
            System.out.println("Go ahead! Make your player changes!");
        } else {
            throw new MaxSubPlayer();
        }
    }

}