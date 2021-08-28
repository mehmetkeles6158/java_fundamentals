package labs_examples.datastructures.hashmap.labs;

import java.util.*;

/**
 * HashMaps Exercise_03
 * <p>
 * Create a new class that does the following:
 * <p>
 * 1) create a LinkedList
 * 2) create a Stack
 * 3) create a Queue
 * 4) create a HashMap
 * <p>
 * Then, add millisecond timers before and after each data structure above and print out
 * how long it takes for each to complete EACH the following tasks, and the total time for
 * each data structure:
 * <p>
 * 1) add 100 elements
 * 2) update 100 elements
 * 3) search for 100 elements
 * 4) delete 100 elements
 */

public class Exercise_03 {

    public static void main(String[] args) {

        //LinkedList


        java.util.LinkedList linkedList = new java.util.LinkedList();

        long start = System.nanoTime();
        for (int i = 1; i < 101; i++) {
            linkedList.add(i);
        }

        long end = System.nanoTime();
        System.out.println(linkedList);

        long elapsedTime = end - start;
        System.out.println("Elapsed time for this linkedlist is " + elapsedTime);


        //Stack
        long start01 = System.nanoTime();

        java.util.Stack stack = new java.util.Stack();

        for (int i = 1; i < 101; i++) {
            stack.add(i);
        }
        System.out.println(stack);

        long end01 = System.nanoTime();
        long elapsedTime01 = end01 - start01;
        System.out.println("Elapsed time for this stack is " + elapsedTime01);


        //Queue
        long start02 = System.nanoTime();

        PriorityQueue queue = new PriorityQueue();

        for (int i = 1; i < 101; i++) {
            queue.add(i);
        }
        System.out.println(queue);

        long end02 = System.nanoTime();
        long elapsedTime02 = end02 - start02;
        System.out.println("Elapsed time for this queue is " + elapsedTime02);

        //HashMap
        long start03 = System.nanoTime();

        java.util.HashMap<Integer, Integer> hashMap = new java.util.HashMap<>();
        int key = 0;
        int value = 0;

        for (key = 0; key < 101; key++) {
            for (value = 0; value < 101; value++) {
                hashMap.put(key, value);
            }
        }

        for (key = 0; key < 101; key++) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }


        long end03 = System.nanoTime();
        long elapsedTime03 = end03 - start03;
        System.out.println("Elapsed time for this linkedlist is " + elapsedTime03);


 }

}



