package labs_examples.multi_threading.labs;


/**
 * Multithreading Exercise 5:
 * <p>
 * Demonstrate the use of a wait() and notify()
 */

class DemoOfNotifyWait {

    boolean task1Done = false;

    synchronized void task1() {
        System.out.println("Welcome to Ohio! Visit Columbus first!");
        task1Done = true;
        System.out.println(
                "Thread t1 about to surrender lock");
        notify();
    }

    synchronized void task2() {

        while (!task1Done) {
            try {
                System.out.println("Thread t2 waiting");
                wait();
                System.out.println(
                        "Thread t2 running again");
            } catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        System.out.println("And then,Do visit Cleveland!");
    }
}

class Main {

    public static void main(String[] args) {


        DemoOfNotifyWait obj = new DemoOfNotifyWait();


        Thread t1 = new Thread(new Runnable() {
            public void run() {

                obj.task1();

            }
        });


        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.task2();
            }
        });


        t2.start();
        t1.start();

    }
}


