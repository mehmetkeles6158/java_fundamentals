package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_02

    For this challenge, please research and implement a custom Trie data structure (https://en.wikipedia.org/wiki/Trie).

    Trie's are very interesting and useful data structures. Many interview questions, and real-world scenario's
    can be properly addressed using a Trie. We use Tries to store things like words and numbers in a highly
    efficient manner. See here: http://theoryofprogramming.com/wp-content/uploads/2015/06/trie12.jpg

    Understanding and implement a Trie is a fantastic step in thinking creatively as a developer to
    accomplish goals as efficiently as possible.

    Here is a fantastic set of relevant interview questions: https://www.techiedelight.com/trie-interview-questions/

 */

import java.util.HashMap;

public class Exercise_02 {


    public class TrieNode {
        private char c;
        private HashMap<Character, TrieNode> children = new HashMap<>();
        private boolean isLeaf;

        public TrieNode() {
        }

        public TrieNode(char c) {
            this.c = c;
        }

        public HashMap<Character, TrieNode> getChildren() {
            return children;
        }

        public void setChildren(HashMap<Character, TrieNode> children) {
            this.children = children;
        }

        public boolean isLeaf() {
            return isLeaf;
        }

        public void setLeaf(boolean isLeaf) {
            this.isLeaf = isLeaf;
        }
    }

    public class Trie {

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            HashMap<Character, TrieNode> children = root.getChildren();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                TrieNode node;
                if (children.containsKey(c)) {
                    node = children.get(c);
                } else {
                    node = new TrieNode(c);
                    children.put(c, node);
                }
                children = node.getChildren();

                if (i == word.length() - 1) {
                    node.setLeaf(true);
                }
            }
        }

        public boolean search(String word) {
            HashMap<Character, TrieNode> children = root.getChildren();

            TrieNode node = null;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (children.containsKey(c)) {
                    node = children.get(c);
                    children = node.getChildren();
                } else {
                    node = null;
                    break;
                }
            }

            if (node != null && node.isLeaf()) {
                return true;
            } else {
                return false;
            }
        }


    }


}