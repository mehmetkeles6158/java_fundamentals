package labs_examples.multi_threading.labs;


class ThreadJoining extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch(Exception ex) {
                System.out.println("Exception has been caught" + ex);
            }
            System.out.println(i);
        }
    }
}

class GFG {
    public static void main (String[] args) {
        ThreadJoining thrd0 = new ThreadJoining();
        ThreadJoining thrd1 = new ThreadJoining();
        ThreadJoining thrd2 = new ThreadJoining();

        // thread thrd0 starts
        thrd0.start();

        // starts second thread after when first thread "thrd0" has died.
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            thrd0.join();
        } catch(Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }
        // thrd1 starts
        thrd1.start();
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            thrd1.join();
        } catch(Exception ex)  {
            System.out.println("Exception has been  caught" + ex);
        }
        // start thrd2 after when thread thrd1 has died.

        thrd2.start();
    }
}
