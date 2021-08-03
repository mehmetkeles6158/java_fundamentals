package labs_examples.lambdas.labs;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 * <p>
 * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * 2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 * value of the same type as the parameter
 * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 * value
 * 6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */

public class Exercise_01 {

    // * <p> Example-01
// * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
// * 2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
// * an anonymous inner class from this interface.
// * <p>

    @FunctionalInterface
    interface BesiktasFuncInterface {

        void Besiktas();
    }

    public static class Example01 {

        public static void main(String args[]) {
            BesiktasFuncInterface msg = () -> System.out.println("Besiktas will be UEFA champions' league this year!");
            msg.Besiktas();


            BesiktasFuncInterface obj = new BesiktasFuncInterface() {
                @Override
                public void Besiktas() {
                    System.out.println("Because, they got the title for the season!");
                }
            };

            obj.Besiktas();
        }

    }


    //* <p> Example02
    // * 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
    // * value of the same type as the parameter
    // * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
    // * an anonymous inner class from this interface.
    // * <p>
    public static class Example02 {

//        @FunctionalInterface
        interface FuncInterface02 {

            public int areaOfSquare(int a);
        }

        public static void main(String[] args) {
            Example02.FuncInterface02 f2 = (x) -> x * x;
            System.out.println("The area of first square is " + f2.areaOfSquare(5) + " in^2.");

            FuncInterface02 obj02 = new FuncInterface02() {
                @Override
                public int areaOfSquare(int a) {
                    return a * a;
                }

            };

            System.out.println("The area of second square is " + obj02.areaOfSquare(6) + " in^2.");
        }


    }


    // * 5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
    // * value
    // * 6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
    // * an anonymous inner class from this interface.
    public static class Example03 {

        @FunctionalInterface
        interface FuncInterface03 {

            public double areaOfRectangle(double a, double b);

        }

        public static void main(String[] args) {
            FuncInterface03 f3 = (a,b) -> a * b;

            System.out.println(f3.areaOfRectangle(5.2, 2.5));

            FuncInterface03 obj03 = new FuncInterface03() {
                @Override
                public double areaOfRectangle(double a, double b) {
                    return a * b;
                }
            };

            System.out.println(obj03.areaOfRectangle(6.5, 4));

        }

    }


//* 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
// */

    // Predicate Built-in Function Example( I showed it with anonymous class first and then with lambda expression)
    public static class Example04 {

    public static void main(String[] args) {
        Predicate<String> isALongWord = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 10;
            }
        };

        String word = "successfully";
        System.out.println(isALongWord.test(word));

        Predicate<String> isALongWord01 = (String t) -> t.length() > 10;
        String word01 = "successfully";
        System.out.println(isALongWord01.test(word01));
    }

    }

    //Consumer Built-in Function Example(Consumer Function)
    static class PriceOfProduct {
        private double price = 0.0;

        public void setPrice(double price) {
            this.price = price;
        }

        public void printPrice() {
            System.out.println(price);
        }
    }

    public static class ConsumerExample {
        public static void main(String[] args) {
            Consumer<PriceOfProduct> updatePrice = p -> p.setPrice(10.90);
            PriceOfProduct p = new PriceOfProduct();
            updatePrice.accept(p);
            System.out.print("The current price of product: " );
            p.printPrice();
        }
    }



}







