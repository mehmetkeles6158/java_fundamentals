package labs_examples.datastructures.linkedlist.labs;


import labs_examples.datastructures.linkedlist.examples.Node;

/**
 * LinkedLists - Exercise_02
 * <p>
 * Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 * class we used here, it must be entirely unique. Please also add at least two
 * additional helper methods that you think could be useful. Refer to Java's built-in
 * LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 * to add and remove elements from the front of the list AND the end of the list.
 * Also, instead of using the index in the get() and remove() methods, these methods should
 * get() and remove() based by the Node's value, not it's index.
 */

public class Exercise_02 {

    public static class MyLinkedList<T> {

        private Node01 head;

        public MyLinkedList(T... data) {
            if (data.length < 1) {
                head = null;
            } else {
                for (int i = 0; i < data.length; i++) {
                    add(data[i]);
                }
            }

        }

        public void add(T data) {
            insert(data);
        }

        public void insert(T data) {

            if (head == null) {
                head = new Node01(data);
            } else {
                Node01 iterator = head;

                while (iterator.next != null) {
                    iterator = iterator.next;
                }

                iterator.next = new Node01(data);

            }

        }

        public void remove(boolean front) {

            if (size() > 1) {

                if (front) {

                    head = head.next;

                } else {

                    Node01 iterator = head;

                    while (iterator.next.next != null) {
                        iterator = iterator.next;
                    }

                    iterator.next = null;

                }

            } else if (size() == 1) {
                head = head.next;
            }

        }

        public int size() {
            int count = 0;
            Node01 iterator = head;

            while (iterator != null) {
                count++;
                iterator = iterator.next;
            }

            return count;
        }


        public void show() {
            Node01 currentNode = head;
            if (currentNode == null) {
                System.out.println("Linked list is empty");
            } else {
                while (currentNode != null) {
                    System.out.print(currentNode.data + " ");
                    currentNode = currentNode.next;
                }
            }
        }

        public String toString() {
            Node01 iterator = head;
            String output = "";

            // iterate through list
            while (iterator != null) {
                output += iterator.data + " ";
                iterator = iterator.next;
            }

            return output;
        }

        public boolean isEmpty() {
            return head == null;
        }

    }


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList<>();

        myLinkedList.add("Mehmet");
        //myLinkedList.add("Akif");
       // myLinkedList.add("Semanur");
//        myLinkedList.add("Keles");


        System.out.println(myLinkedList);

        boolean front = true;
        myLinkedList.remove(front);
        System.out.println(myLinkedList);

//        myLinkedList.show();
    }


}


