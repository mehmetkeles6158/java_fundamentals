package labs_examples.multi_threading.labs;

import javafx.scene.layout.Priority;

/**
 * Multithreading Exercise 2:
 * <p>
 * Create an application that creates a Thread using the Thread class
 */
class Multithreading extends Thread {
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


public class Exercise_02 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            Multithreading object = new Multithreading();
            object.start();

        }
    }
}