package labs_examples.fundamentals.labs;


import java.util.Locale;

/**
 * Fundamentals Exercise 5: Working with Strings
 * <p>
 * Please follow the instructions in the comments below
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello world!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int length = str.length();

        System.out.println("The length of str is " + length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean equalStrings = str.equalsIgnoreCase(str2);

        System.out.println("str is equal to str2 ? answer:" + equalStrings);

        // please concatenate str & str2 and set the result to a new String variable below

        String newString = "Say hello twice: " + str + " " + str2 + " and say bye!";

        System.out.println(newString);

        System.out.println("The length of the String is " + str.length());

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        System.out.println(str.indexOf("e"));

        System.out.println(str.contains("hel"));

        System.out.println(str.contains("besiktas"));

        System.out.println(str2.substring(2, 4));

        System.out.println(str2.replace('l', 'k'));


        String str3 = "Besiktas is champion!";

        System.out.println(str3.toUpperCase());

        System.out.println(str3.toLowerCase());


    }


}