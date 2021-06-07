package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {
        //// Didn't make too much progress. But  I tried a lot . :( still didn't get desirable outcome. Could you please help with that?

        // 1) I create a scanner first!
        Scanner words = new Scanner(System.in);
        // 2) I prompt user secondly!
        System.out.print("Put your word here: ");
        // 3) I assign input to variable as int
        String str = words.nextLine();
        // 4) I write completed code here!

        int i = 0;
        while (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            System.out.println(i);
        }

    }


}



