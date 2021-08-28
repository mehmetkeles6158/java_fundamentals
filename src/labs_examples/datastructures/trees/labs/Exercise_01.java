package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_01

    Please demonstrate how to create a custom Binary Search Tree (BST). Using your custom BST, demonstrate how to:

        1.) Create a new CustomBST
        2.) Insert new elements
        3.) Retrieve elements
        4.) Update elements
        5.) Delete elements
        6.) Print elements (Bonus: try in-order traversal, pre-order traversal, post-order traversal)
        7.) Keep the tree well balanced

 */

public class Exercise_01 {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(5);
        bt.add(2);
        bt.add(1);
        bt.add(25);
        System.out.println(bt);


    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public static class BinaryTree {
        Node root;


        private Node insert(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }
            if (value < current.value) {
                current.left = insert(current.left, value);
            } else if (value > current.value) {
                current.right = insert(current.right, value);
            } else {
                return current;
            }
            return current;
        }

        public void add(int value) {
            insert(root, value);

        }

        private boolean containItem(Node current, int value) {
            if (current == null) {
                return false;
            }
            if (value == current.value) {
                return true;
            }

            if (value < current.value) {
                return containItem(current.left, value);
            }
            return containItem(current.right, value);
        }

        public boolean contain(int value) {
            return containItem(root, value);
        }


        private Node deleteItems(Node root, int value) {

            if (root == null) {
                return root;
            }
            if (value < root.value) {
                root.left = deleteItems(root.left, value);
            } else if (value > root.value) {
                root.right = deleteItems(root.right, value);
            } else {
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;

                root.value = findSmallestValue(root.right);

                root.right = deleteItems(root.right, root.value);
            }
            return root;
        }

        private int findSmallestValue(Node root) {
            return root.left == null ? root.value : findSmallestValue(root.left);
        }


        public void delete(int value) {
            root = deleteItems(root, value);
        }

        public void traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                System.out.print(" " + node.value);
                traverseInOrder(node.right);
            }
        }

        public void traversePreOrder(Node node) {
            if (node != null) {
                System.out.print(" " + node.value);
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }
        }

        public void traversePostOrder(Node node) {
            if (node != null) {
                traversePostOrder(node.left);
                traversePostOrder(node.right);
                System.out.print(" " + node.value);
            }
        }

        public Node search(Node root, int value){
            if(root == null){
                return null;
            }
            while (root != null){
                if(value == root.value){
                    return root;
                }else if(value > root.value){
                    root = root.right;
                }else {
                    root = root.left;
                }
            }
            return null;
        }


    }


}