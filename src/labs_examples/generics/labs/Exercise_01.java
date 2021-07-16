package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 * <p>
 * 1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 * 2.) Create a few objects of your generic class with different data types to demonstrate it's
 * dynamic usage.
 */

public class Exercise_01 {

    public static void main(String[] args) {
        MyGeneric<String> obj01 = new MyGeneric();
        obj01.setItems1("Besiktas is playing great today!");
        String str = obj01.getItems1();
        System.out.println(str);

        MyGeneric<Integer> obj02 = new MyGeneric();
        obj02.setItems2(1903);
        Integer bjk = obj02.getItems2();
        System.out.println("Besiktas exists first. It's born in " + bjk + ".");

    }


    static class MyGeneric<T> {

        private T items1;
        private T items2;

        public MyGeneric() {
            this.items1 = items1;
            this.items2 = items2;
        }

        public T getItems1() {
            return items1;
        }

        public void setItems1(T items1) {
            this.items1 = items1;
        }

        public T getItems2() {
            return items2;
        }

        public void setItems2(T items2) {
            this.items2 = items2;
        }
    }
}


