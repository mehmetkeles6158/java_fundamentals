package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 * <p>
 * In one of the previous exercises, demonstrate changing the priority of a thread
 */
class Multithreading01 extends Thread {
    public void run() {
        try {

            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        } catch (Exception e) {

            System.out.println("Exception is caught");
        }
    }
}


public class Exercise_03 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            Multithreading01 obj01 = new Multithreading01();
            Multithreading01 obj02 = new Multithreading01();
            Multithreading01 obj03 = new Multithreading01();






            obj01.setPriority(2);
            obj01.start();
            obj02.setPriority(5);
            obj02.start();
            obj03.setPriority(8);
            obj03.start();



            System.out.println("obj01 thread priority : "
                    + obj01.getPriority());


            System.out.println("obj02 thread priority : "
                    + obj02.getPriority());

            System.out.println("obj3 thread priority : "
                    + obj03.getPriority());

            System.out.println(
                    "Currently Executing Thread : "
                            + Thread.currentThread()
                            .getName());

            System.out.println(
                    "Main thread priority : "
                            + Thread.currentThread().getPriority());

            // Main thread priority is set to 10
            Thread.currentThread().setPriority(10);
            System.out.println(
                    "Main thread priority : "
                            + Thread.currentThread().getPriority());

        }
    }
}