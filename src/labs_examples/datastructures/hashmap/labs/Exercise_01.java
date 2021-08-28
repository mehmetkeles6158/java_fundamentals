package labs_examples.datastructures.hashmap.labs;

import com.sun.tools.corba.se.idl.constExpr.BooleanOr;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * HashMaps Exercise_01
 * <p>
 * Demonstrate you're mastery of using Java's built-in HashMap class below.
 * <p>
 * Using a HashMap demonstrate the use of the following methods:
 * <p>
 * put()
 * get()
 * putAll()
 * size()
 * contains()
 * keySet()
 * entrySet()
 * putIfAbsent()
 * remove()
 * replace()
 * forEach()
 * clear()
 */

public class Exercise_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> capacityOfStadium = new HashMap<>();

        capacityOfStadium.put("VodafonePark", 401903);
        capacityOfStadium.put("CampNou", 123000);
        capacityOfStadium.put("StampfordBridge", 98000);
        capacityOfStadium.put("SignalUdanaPark", 68000);
        System.out.println("The capacity of besiktas-VodafonePark is " + capacityOfStadium.get("VodafonePark") + ".");

        HashMap<String, Integer> new_stadium01 = new HashMap<>();
        new_stadium01.putAll(capacityOfStadium);
        System.out.println(new_stadium01);

        int x = capacityOfStadium.size();
        System.out.println(x);

        Boolean hasKey = capacityOfStadium.containsKey("CampNou");
        System.out.println(hasKey);

        System.out.println(capacityOfStadium.keySet());

        System.out.println(capacityOfStadium.entrySet());

        Integer check = capacityOfStadium.putIfAbsent("Mancity-Park", 138000);
        System.out.println(check);

        Integer r = capacityOfStadium.remove("SignalUdanaPark");
        System.out.println(r);
        System.out.println(capacityOfStadium);

        capacityOfStadium.replace("CampNou", 168000);
        System.out.println("Barcelona' new stad' capacity is " + capacityOfStadium.get("CampNou") + ".");
        System.out.println(capacityOfStadium);

        System.out.println();
        BiConsumer<String, Integer> action01 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.print("Stadium = " + k);
                System.out.print("\t Capacity = " + v);
                System.out.println();
            }
        };

        capacityOfStadium.forEach(action01);

        capacityOfStadium.clear();
        System.out.println(capacityOfStadium);
    }

}
