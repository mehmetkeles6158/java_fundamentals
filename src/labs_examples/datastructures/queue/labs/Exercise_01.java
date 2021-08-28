package labs_examples.datastructures.queue.labs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 * above) by completing the following:
 * <p>
 * 1) instantiate a new Queue
 * 2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

public class Exercise_01 {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();

        queue1.add("Mitchy");
        queue1.add("Batshuayi");
        queue1.add("Kevin");
        queue1.add("NKodou");
        queue1.add("Adam");
        System.out.println(queue1);

        String r1 = queue1.remove();
        System.out.println(r1);
        System.out.println(queue1);

        String p1 = queue1.peek();
        System.out.println(p1);

        Boolean c1 = queue1.contains("Atiba");
        System.out.println("This queue1 contains \"Atiba\" " + "->" + " " + c1 + ".");

        String i1 = queue1.poll();
        System.out.println(i1);
        System.out.println(queue1);

        boolean o1 = queue1.offer("Salih");
        System.out.println(o1);
        System.out.println(queue1);

        String e1 = queue1.element();
        System.out.println(e1);
        System.out.println(queue1);

        queue1.clear();
        System.out.println(queue1);



        // Another implementation'example for queue1 interface


        Queue<Integer> numbers = new LinkedList<>();


        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Queue after deletion: " + numbers);


    }
}