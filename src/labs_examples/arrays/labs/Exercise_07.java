package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 * ArrayLists
 * <p>
 * Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 * Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 * typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 * shows a list of methods.
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> besiktasRoster = new ArrayList<>();

        besiktasRoster.add("Ersin");
        besiktasRoster.add("Rosier");
        besiktasRoster.add("Vida");
        besiktasRoster.add("Wellington");
        besiktasRoster.add("Ridvan");
        besiktasRoster.add("De Souza");
        besiktasRoster.add("Atiba");
        besiktasRoster.add("Adem");
        besiktasRoster.add("Ghezzal");
        besiktasRoster.add("Kevin");
        besiktasRoster.add("Vincent");
        besiktasRoster.remove("Ersin");
        besiktasRoster.add("Utku");
        boolean ans = besiktasRoster.contains("Gokhan");

        System.out.println(ans);

        System.out.println(besiktasRoster);

        if (!besiktasRoster.isEmpty()) {
            for (String s : besiktasRoster) {
                System.out.println(s + " ");
            }
        }
    }
}
