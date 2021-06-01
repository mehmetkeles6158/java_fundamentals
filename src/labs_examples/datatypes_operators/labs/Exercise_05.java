package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 * <p>
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");
        }

        // write your code below
        boolean case_1 = true;
        boolean case_2 = true;
        if (case_1 & case_2) {
            System.out.println("Case-1 is correct");
        }

        int m = 23;
        if (m != 20) {
            System.out.println("m is equal to 23!");
        }

        boolean event_1 = true;
        boolean event_2 = false;
        if (event_1 || event_2) {
            System.out.println("If Event-1 will start on time , we can start event-2!");
        }

        boolean besiktasChampion = true;
        boolean otherTeams = false;
        if (besiktasChampion && otherTeams) {
            System.out.println("Other team got the title");
        } else {
            System.out.println("Besiktas got the league title again. They are champion!");
        }

        boolean besiktas = true;
        boolean chelsea = false;
        if (besiktas ^ chelsea) {
            System.out.println("Besiktas is a great soccer team!");
        }


    }


}

