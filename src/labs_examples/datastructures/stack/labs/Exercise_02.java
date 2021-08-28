package labs_examples.datastructures.stack.labs;


/**
 * Stacks - Exercise_02
 * <p>
 * Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 * rather than the LinkedList as in the example we have already seen.
 * <p>
 * Your custom Stack class must also do the following: (Ryan Take 2)
 * <p>
 * 1) throw a custom exception when trying to pop an element from an empty Stack
 * 2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 * 3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 * 4) contain the methods peekFirst() and peekLast()
 * 5) contain a size() method
 * 6) contain a method to print out the data of all elements in the Stack
 * <p>
 * TIP: To initialize an new array of a Generic type you can use this:
 * T[] data = (T[]) new Object[10];
 */


public class Exercise_02 {

    public static class Stack<V> {
        private int top;
        private int capacity;

        private V[] myList = (V[]) new Object[10];


        public void push(V x) {
            if (isFull()) {
                System.out.println("Stack OverFlow");
                System.exit(1);
            }

            System.out.println("Inserting " + x);
            myList[++top] = x;

            if(capacity > myList.length * 0.50) {

                resize();
            }
        }


        public V pop() {

            if (isEmpty()) {
                System.out.println("STACK EMPTY");
                System.exit(1);
            }
            return myList[top--];
        }

        public int getSize() {
            return top + 1;
        }


        public Boolean isEmpty() {
            return top == -1;
        }

        public Boolean isFull() {
            return top == capacity - 1;
        }

        public void printStack() {
            for (int i = 0; i <= top; i++) {
                System.out.print(myList[i] + ", ");
            }
        }

        private void resize() {
            Entry<V>[] old = (Entry<V>[]) myList;

            myList = (V[]) new Entry[old.length * 2];

            for (int i = 0; i < old.length; i++) {
                try {
                    Entry entry = old[i];
                    push((V) entry.getValue());
                    while (entry.next != null) {
                        entry = entry.next;
                        push((V) entry.getValue());
                    }
                } catch (Exception e) {
                }
            }
        }

        public static void main(String[] args) {
            Stack stack = new Stack();

            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.print("Stack: ");
            stack.printStack();

            stack.pop();
            System.out.println("\nAfter popping out");
            stack.printStack();

        }

    }

    class Entry<V> {
        private V value;
        Entry next = null;

        public Entry(V value) {
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}