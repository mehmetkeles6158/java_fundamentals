package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Lambdas Exercise 4:
 * <p>
 * Stream API Labs
 * <p>
 * 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 * 2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 * 3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 * to get the sum of the modified list
 * 4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 * function to average the remaining numbers, assign this result to an int variable.
 * 5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * 6) Demontsrate how to Stream a text file and print out each line
 * 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the element at the 1 index for each array.
 * 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the sum of all elements at index 2.
 * 9) Demonstrate the anyMatch() function.
 * 10) Demonstrate the allMatch() function.
 * 11) Demonstrate the collect() terminal operation to store resulting values into a List
 */

public class Exercise_04 {
    public static void main(String[] args) {

        // Step 1) declare a Lambda expression using the Runnable interface

        // Step 2) declare a new Thread object and pass in the Runnable Lambda

        // Step 3) start the thread

    }

    // 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
    static class Example001 {

        public static void main(String[] args) {
            IntStream.range(1, 16).forEach(System.out::print);
            System.out.println();
        }

    }

    //2) Demonstrate the use of the sum function to determine the range of a set of numbers.
    static class Example002 {
        public static void main(String[] args) {

            int sum = IntStream.range(-2, 8).sum();
            System.out.println(sum);

        }


    }

    //3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
// * to get the sum of the modified list
    static class Example003 {
        public static void main(String[] args) {

            List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
            int sumOfNumbers = nums.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println(sumOfNumbers);
        }

    }

    //4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average

    static class Example004 {
        public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(1, 2, 6, 8, 9, 10, 11, 12, 13, 14, 15);
            double averageOfNums = nums.stream().mapToInt(Integer::intValue).filter(x -> x < 10).
                    average().orElse(Double.NaN);

            System.out.println(averageOfNums);

        }

    }

    //5)Demonstrate the reduce() function to determine the sum of a list of Integers

    static class Example005 {
        public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(25, 17, 48, 63, 40);
            Integer sum = nums.stream().reduce(0, Integer::sum);
            System.out.println(sum);
        }
    }

    //* 6) Demontsrate how to Stream a text file and print out each line

    static class Example006 {

        public static void main(String[] args) throws IOException {
            String pathOfText = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv";

            Stream<String> example6 = Files.lines(Paths.get(pathOfText));

            example6.forEach(System.out::println);

        }
    }

    //7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
    // * the print out the element at the 1 index for each array.
    static class Example007 {

        public static void main(String[] args) throws IOException {

            String pathOfText = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv";
            Stream<String> rows1 = Files.lines(Paths.get(pathOfText));
            rows1

                    .map(x -> x.split(","))

                    .forEach(x -> System.out.println(x[1]));  //print

            rows1.close();

        }
    }

    // 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
    // * the print out the sum of all elements at index 2.
    static class Example008 {
        public static void main(String[] args) throws IOException {

            String pathOfText = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv";
            Stream<String> rows2 = Files.lines(Paths.get(pathOfText));

             Double mySum = rows2
                    .map(x -> x.split(","))
                    .map(x -> Double.parseDouble(x[2]))
                    .reduce(0.0,Double::sum);

            rows2.close();

            System.out.println(mySum);
        }

    }

    static class Example09 {
        public static void main(String[] args) {

            IntStream nums = IntStream.of(11, 2, 33, 41, 5, 61, 85, 97, 101);

            boolean answer = nums.anyMatch(x -> x % 2 == 0);

            System.out.println(answer);
        }
    }

    // 10) Demonstrate the allMatch() function.
    static class Example10 {
        public static void main(String[] args) {

            IntStream nums = IntStream.of(3, 6, 9, 12, 14);

            boolean answer2 = nums.allMatch(y -> y % 3 == 0);

            System.out.println(answer2);
        }
    }

    //11) Demonstrate the collect() terminal operation to store resulting values into a List
    static class Example11 {

        public static void main(String[] args) throws IOException {

            String teams = "/Users/mehmetkeles58/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/lambdas/labs/teams.csv";
            List<String> team01 = Files.lines(Paths.get(teams))

                    .filter(x -> x.contains("tas"))

                    .collect(Collectors.toList());

            team01.forEach(x -> System.out.println(x));
        }

    }

}

















