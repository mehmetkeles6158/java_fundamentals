package labs_examples.generics.labs;

import videos_source_code.classes.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static labs_examples.generics.labs.Sum.sumMethod;

/**
 * Generics Exercise 3:
 * <p>
 * 1) Write a generic method that accepts two generic arguments. This generic method should only accept
 * arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 * numbers were passed in regardless of their type.
 * <p>
 * 2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 * <p>
 * 3) Write a generic method to exchange the positions of two different elements in an array.
 * <p>
 * 4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */
public class Exercise_03 {
    public static void main(String[] args) {
// 1) Write a generic method that accepts two generic arguments. This generic method should only accept
//    arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
//      numbers were passed in regardless of their type.
        Sum.sumMethod(15.3, 20);
        System.out.println();

// 3) Write a generic method to exchange the positions of two different elements in an array.
        Integer[] someElements = {11, 22, 33, 44, 55, 66, 77, 88};
        Exchange.change(someElements, 1, 4);
        System.out.println(Arrays.toString(someElements));
        System.out.println();

//4) Write a generic method to find the largest element within the range (begin, end) of a list.
        List<Integer> someList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Largest.largestElement(someList, 1, 4));


    }
}
//1) Write a generic method that accepts two generic arguments. This generic method should only accept
// *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
// *      numbers were passed in regardless of their type.


class Sum {
    public static <T extends Number> void sumMethod(T arg1, T arg2) {

        Number sum = 0;

        sum = arg1.doubleValue() + arg2.doubleValue();
        System.out.println(sum);
    }

}

//2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes(still working on it)


//3) Write a generic method to exchange the positions of two different elements in an array.

class Exchange {
    public static <T> void change(T[] m, int i, int j) {
        T tempVar = m[i];
        m[i] = m[j];
        m[j] = tempVar;
    }

}

// 4) Write a generic method to find the largest element within the range (begin, end) of a list.

class Largest {
    public static <T extends Comparable> T largestElement(List<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T element = list.get(i);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}
