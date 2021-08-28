package labs_examples.datastructures.linkedlist.labs;

public class Node01<T> {
    T data;
    Node01 next;

    public Node01(T data) {
        this.data = data;
        this.next = null;
    }

    public Node01(T data, Node01 next) {
        this.data = data;
        this.next = next;
    }
}
