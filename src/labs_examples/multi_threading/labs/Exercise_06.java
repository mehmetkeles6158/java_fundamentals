package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 * <p>
 * Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 * print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */
class MultipleThreadingCount100 {
    int count = 1;
    int maxNum = 100;

    public void printOddNums() {
        synchronized (this) {
            while (count < maxNum) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(count + " ");
                count++;
                notify();
            }
        }
    }

    public void printEvenNums() {
        synchronized (this) {
            while (count < maxNum) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(count + " ");
                count++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        MultipleThreadingCount100 mt100 = new MultipleThreadingCount100();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                mt100.printEvenNums();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                mt100.printOddNums();
            }
        });
        t1.start();
        t2.start();
    }
}