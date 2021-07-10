package labs_examples.multi_threading.labs;

class MultipleOfNum {

    void Multiple(int n) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

class MyThread1 extends Thread {
    MultipleOfNum t;

    MyThread1(MultipleOfNum t) {
        this.t = t;
    }

    public void run() {
        System.out.println("Do multiple of five first until 50 included and then multiple of three until 30 included!");
        t.Multiple(5);
    }

}

class MyThread2 extends Thread {

    MultipleOfNum t;

    MyThread2(MultipleOfNum t) {
        this.t = t;
    }

    public void run() {
        t.Multiple(3);
    }


}


class TestSynchronizedBlock1 {
    public static void main(String args[]) {
        MultipleOfNum obj = new MultipleOfNum();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();

    }
}