package labs_examples.objects_classes_methods.labs.methods;


/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 60;
        int b = 20;
        int multiplyTwoNums = multiply(a, b);
        int divideTwoNums = divide(a, b);
        System.out.println(multiplyTwoNums);
        System.out.println(divideTwoNums);

        myJoke();

        int years = 5;
        int totalSeconds = calSeconds(years);
        System.out.println(totalSeconds);

        funWithNums(1, 2, 3, 4, 5);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static void myJoke() {
        System.out.println("Did you hear about the mathematician who’s afraid of negative numbers? Answer: He’ll stop at nothing to avoid them.");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int calSeconds(int years) {
        return years * 365 * 24 * 60 * 60;

    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static void funWithNums(int... a) {
        System.out.println("Number of arguments: " + a.length);

        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }


}
