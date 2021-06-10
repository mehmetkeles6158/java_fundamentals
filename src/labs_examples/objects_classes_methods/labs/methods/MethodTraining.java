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

public class MethodTraining {

    public static void main(String[] args) {
        //  1) Demonstrate method overloading in this class
        int a = 4;
        int b = 10;
        ;
        double c = 5.16;
        double d = 13.46;

        int x = multiply(a, b);
        int y = divide(5, 12);
        double z = multiply(c, d);
        double k = divide(a, b);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);

//    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        double cal = mathMax(18, 15, 22, 7);
        System.out.println("The largest number is " + cal);

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

}








