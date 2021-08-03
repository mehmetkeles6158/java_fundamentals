package labs_examples.lambdas.labs;

import java.util.Comparator;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 * <p>
 * 1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 * 10 of them! You can do it! You'll know so much about them when you're done!
 */

//I will only  give  8 examples here. Because, I already did two of them in exercise-01 lab.
// Also,I got a help with this java doc to understand syntax and details of functions( https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)
public class Exercise_02 {


    //1) Function
    public static class Function01 {
        public static void main(String[] args) {
            int n = 5;
            changeValueMethod(n, val -> val + 10);
            changeValueMethod(n, val -> val * 100);
        }

        static void changeValueMethod(int a, Function<Integer, Integer> f1) {
            int result = f1.apply(a);
            System.out.println(result);
        }
    }


    // 2) UnaryOperator
    public static class UnaryOperator02 {

        public static void main(String[] args) {
            UnaryOperator<String> example02 = x -> x + " is great !";
            System.out.println(example02.apply("Learning Java Programing"));
        }
    }


    //3) Binary
    public static class Binary03 {
        public static void main(String args[]) {
            BinaryOperator<Integer>
                    example03 = BinaryOperator
                    .maxBy(
                            Comparator.naturalOrder());

            System.out.println(example03.apply(98, 11));
//Another simple example I wrote here!
            BinaryOperator<Integer> otherExample = (a, b) -> a + b;
            System.out.println(otherExample.apply(5, 3));
        }
    }


    //4) Supplier
    public static class Example04 {
        public static void main(String[] args) {
            Supplier<String> bestTeams = () -> {
                return "Besiktas, Barcelona, PSG, Bayern, ManCity";
            };

            String teams = bestTeams.get();
            System.out.println(teams.toString());

        }
    }

    // 5) Interface IntPredicate
    public static class Example05 {
        public static void main(String[] args) {
            IntPredicate checking = (int a) -> a > 10;

            int x = 15;
            System.out.println(checking.test(x));
        }
    }

    //6) BiConsumer
    public static class Example06 {
        public static void main(String[] args) {
            BiConsumer<String, String> example06 = (a, b) -> {
                if (a.length() == b.length()) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
                return;
            };

            example06.accept("Mehmet", "Semanur");
        }

    }

    // 7)BiFunction
    public static class Example07 {
        public static void main(String args[]) {

            BiFunction<Double, Double, Double> areaOfTriangle = (a, b) -> (a + b) / 2;
            System.out.println("Area of The Triangle = " + areaOfTriangle.apply(6.0, 3.0) + " cm^2.");


            BiFunction<Double, Double, Double> areaOfRectangle = (a, b) -> a * b;
            System.out.println("Area of Rectangle = " + areaOfRectangle.apply(7.0, 11.0) + " cm^2.");
        }

    }

    // 8) DoubleConsumer
    public static class Example08 {
        public static void main(String args[]) {

            DoubleConsumer
                    inToCm
                    = a -> System.out.println(a * 2.56);
            inToCm.accept(10);

        }

    }


}
