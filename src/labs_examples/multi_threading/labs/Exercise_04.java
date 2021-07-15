package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 * <p>
 * Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 * working as expected
 */

class PemdasRule {
    public void send(String msg) {
        System.out.println(msg);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class ThreadedSend extends Thread {
    private String msg;
    PemdasRule pemdasRule;

    ThreadedSend(String m, PemdasRule obj) {
        msg = m;
        pemdasRule = obj;
    }

    public void run() {
        synchronized (pemdasRule) {
            pemdasRule.send(msg);
        }
    }
}

class SyncExample {
    public static void main(String[] args) {
        System.out.println("Question: (2x5 + 10:2) + 3^2 - 12 + 13 . Follow steps to solve the question!");
        PemdasRule snd = new PemdasRule();
        ThreadedSend S1 = new ThreadedSend(" This is PEMDAS :) ", snd);
        ThreadedSend S2 = new ThreadedSend(" First Step: Handle parenthesis! ", snd);
        ThreadedSend S3 = new ThreadedSend(" Second Step: Do exponent! ", snd);
        ThreadedSend S4 = new ThreadedSend(" Third Step: Multiply and divide left to right! ", snd);
        ThreadedSend S5 = new ThreadedSend(" Fourth Step: Add and subtract left to right! ", snd);


        S1.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            S1.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }

        S2.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            S2.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }

        S3.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            S3.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }

        S4.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            S4.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }


        S5.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            S5.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }


    }
}


