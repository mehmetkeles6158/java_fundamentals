package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 * <p>
 * Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 * Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */


import java.util.ArrayList;
import java.util.List;

import static labs_examples.generics.labs.Demo.sumArray;

public class Exercise_02 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();

        doubles.add(1.2);
        doubles.add(3.4);


        Demo.sumArray(doubles);


        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Demo.sumArray(numbers);

    }
}

class Demo {

    public static <E extends Number> void sumArray(List<? extends Number> numlist) {
        Number sum = 0;
        for (Number n : numlist) {

            sum = sum.doubleValue() + n.doubleValue();

        }
        System.out.println(sum);
    }

}