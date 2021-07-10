package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 * <p>
 * 1: Create an application that starts a Thread by implementing the Runnable interface
 * 2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 */

class Exercise_01 {
    public static void main(String[] args) {

        System.out.println("--Main Thread Starting!--");

        MyRunnable runnable01 = new MyRunnable();
        Thread thread01 = new Thread(runnable01, "Option-1");
        thread01.start();

        Thread thread02 = new Thread(new MyRunnable(), "Option-2");
        thread02.start();

        new Thread(new MyRunnable(), "Option-3").start();
        System.out.println("--Main Thread End--");

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int count = 0; count < 3; count++) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + "-Making Progress!");
            }

        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");

        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}


