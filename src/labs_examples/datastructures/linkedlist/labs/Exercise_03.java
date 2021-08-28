package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {
    static class MyDoublyLinkedList {
        class Node{
            String teams;
            Node previous;
            Node next;

            public Node(String teams) {
                this.teams = teams;
            }
        }
        Node head, tail = null;

        public void addNode(String teams) {

            Node newNode = new Node(teams);
            if(head == null) {
                head = tail = newNode;
                head.previous = null;
                tail.next = null;
            }
            else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                tail.next = null;
            }
        }

        public void printNodes() {
            Node current = head;
            if(head == null) {
                System.out.println("Doubly linked list is empty");
                return;
            }
            System.out.println("Nodes of doubly linked list: ");
            while(current != null) {
                System.out.print(current.teams + " ");
                current = current.next;
            }
        }
    }
    static class Main{
        public static void main(String[] args) {
            MyDoublyLinkedList dl_List = new MyDoublyLinkedList();
            dl_List.addNode("Besiktas");
            dl_List.addNode("Chelsea");
            dl_List.addNode("Barca");
            dl_List.addNode("Real Madrid");
            dl_List.addNode("ManCity");

            dl_List.printNodes();
        }
    }
}