package labs_examples.datastructures.queue.labs;

/**
 * Queues - Exercise_02
 * <p>
 * Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 * rather than the LinkedList as in the example we have already seen.
 * <p>
 * Your custom Queue class must also do the following:
 * <p>
 * 1) throw a custom exception when trying to pop  an element from an empty Queue
 * 2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 * 3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 * 4) contain the methods peekFirst() and peekLast()
 * 5) contain a size() method
 * 6) contain a method to print out the data of all elements in the Queue
 */

public class Exercise_02 {

    static class MyQueue<T> {
        private int size;
        private int front;
        private int rear;

        T[] myList = (T[]) new Object[8];

        MyQueue() {
            front = -1;
            rear = -1;
        }

        boolean isFull() {
            if (front == 0 && rear == myList.length - 1) {
                return true;
            }
            return false;
        }

        boolean isEmpty() {
            if (front == -1) {
                return true;
            } else {
                return false;
            }
        }

        void enQueue(T element) {

            try {
                if (isFull()) {
                    System.out.println("Queue is full");
                } else {
                    if (front == -1) {
                        front = 0;
                    }
                    rear++;
                    myList[rear] = element;
                    System.out.println("Insert " + element);
                }
            } catch (Exception e) {

            }

            if (size == myList.length) {
                resize(myList.length * 2);
            }

            myList[rear++] = (T) myList;

            if (rear == myList.length) {
                rear = 0;
            }
            size++;
        }

        void deQueue() {
            T element;
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }
            else {
                element = (T) myList[front];
                if (front >= rear) {
                    front = -1;
                    rear = -1;
                }
                else {
                    front++;
                }
                System.out.println( element + " Deleted");
            }
        }

        void display() {
            int i;
            if (isEmpty()) {
                System.out.println("Empty Queue");
            }
            else {
                System.out.println("\nFront index-> " + front);

                System.out.println("Items -> ");
                for (i = front; i <= rear; i++)
                    System.out.print(myList[i] + "  ");

                System.out.println("\nRear index-> " + rear);
            }
        }

        void resize(int capacity) {
            assert capacity >= size*0.75;
            T[] copy = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                copy[i] = myList[(front + i) % myList.length];
            }

            myList = copy;
            front = 0;
            rear  = size;
        }

        public int size() {
            return size;
        }

    }

    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.deQueue();

        for(int i = 1; i < 6; i ++) {
            q.enQueue(i);
        }

        q.enQueue(6);

        q.display();

        q.deQueue();

        q.display();

    }


    }


