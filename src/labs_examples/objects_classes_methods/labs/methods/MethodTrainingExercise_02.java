package labs_examples.objects_classes_methods.labs.methods;

//Create a new class called MethodTraining.java and in this class please do the following:
//
//    1) Demonstrate method overloading in this class
//
//    2) Demonstrate the difference between "pass by value" and "pass by reference"
//
//    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
//
//    4) Write a method to count all consonants (the opposite of vowels) in a String
//
//    5) Write a method that will determine whether or not a number is prime
//
//    6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//            which is passed in as an argument
//
//    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//        length of the returned list
//
//
//    8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//        variable is used to temporarily store individual values in the array


import java.util.ArrayList;
import java.util.Arrays;

public class MethodTrainingExercise_02<array> {

    public static void main(String[] args) {
        //  1) Demonstrate method overloading in this class
        int a = 40;
        int b = 10;
        ;
        double c = 65.5;
        double d = 13.1;

        int x = multiply(a, b);
        int y = divide(36, 12);
        double z = multiply(c, d);
        double k = divide(a, b);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);

//    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        double cal = mathMax(18, 15, 22, 7);
        System.out.println("The largest number is " + cal);

        //    4) Write a method to count all consonants (the opposite of vowels) in a String

        int check = count_Vowels("Besiktas");
        System.out.println("Count of all consonants is " + check);

//    5) Write a method that will determine whether or not a number is prime
        boolean numbers = checkPrime(8);
        System.out.println("This is a prime number: " + numbers);

        //    6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//            which is passed in as an argument

        int[] someNumbers = new int[]{2, 3, 5, 6, 7};
        getSmallestAndLargest(someNumbers);


        //    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//        length of the returned list


        System.out.println(myNumbers(10, 2, 5));

        //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        //     instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        //       variable is used to temporarily store individual values in the array

        int[] goalsOfBesiktas = new int[]{87, 100, 90, 70, 110};
        System.out.println(Arrays.toString(reverseArray(goalsOfBesiktas)));


    }


    //    1) Demonstrate method overloading in this class

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }


//    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)


    public static int mathMax(int a, int b, int c, int d) {

        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }


//    4) Write a method to count all consonants (the opposite of vowels) in a String

    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                count++;
            }
        }
        return count;
    }

    //    5) Write a method that will determine whether or not a number is prime

    public static boolean checkPrime(int nums) {
        boolean prime = true;

        if (nums <= 1) {
            prime = false;

        } else {
            for (int i = 2; i <= nums / 2; i++) {
                if ((nums % i) == 0) {
                    prime = false;

                    break;
                }
            }

        }
        return prime;
    }

    //    6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//            which is passed in as an argument

    public static int[] getSmallestAndLargest(int[] array) {

        int[] smallArray = new int[2];

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = smallArray[i];
            } else if (array[i] > largest) {
                largest = smallArray[i];
            }

        }
        return array;
    }


    //    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method,print out the
////        length of the returned

    public static ArrayList<Integer> myNumbers(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= maxNum; i++) {

            if (i % divisor1 == 0 && i % divisor2 == 0)

                numbers.add(i);

        }
        return numbers;
    }

    //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //     instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //       variable is used to temporarily store individual values in the array

    public static int[] reverseArray(int[] array) {


        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return array;


    }


}






















