package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedLists - Exercise_01
 * <p>
 * Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 * <p>
 * 1) create a LinkedList (from Java's libraries)
 * 2) add()
 * 3) addAll()
 * 4) addFirst()
 * 5) addLast()
 * 6) getFirst()
 * 7) getLast()
 * 8) get()
 * 9) set()
 * 10) push()
 * 11) pop()
 * 12) remove()
 * 13) contains()
 * 14) listIterator()
 * 15) clear()
 */

public class Exercise_01 {
    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();

        players.add("Mert Gunok");
        players.add("Rosier");
        players.add("Vida");
        players.add("Wellington");
        players.add("Ridvan");

        Collection<String> collection = new ArrayList<String>();

        collection.add("Ghezzal");
        collection.add("De Souza");
        collection.add("Atiba");
        collection.add("Texeria");
        collection.add("Nkodou");
        System.out.println(players);

        players.addAll(collection);
        System.out.println(players);

        players.add("Batshuayi");
        System.out.println(players);

        players.addFirst("Ersin");
        System.out.println(players);

        players.addLast("Kenan");
        System.out.println(players);

        System.out.println(players.getFirst());

        System.out.println(players.getLast());

        System.out.println(players.get(7));

        System.out.println(players.set(12,"Aguero"));
        System.out.println(players);

        players.push("Ersin");

        String s = players.pop();
        System.out.println(s);
        System.out.println(players);

        System.out.println(players.remove(0));
        System.out.println(players);

        Boolean isThere = players.contains("Atiba");
        System.out.println(isThere);

        System.out.println();

        ListIterator list_Iter = players.listIterator(6);
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }

        players.clear();
        System.out.println(players);

    }
}