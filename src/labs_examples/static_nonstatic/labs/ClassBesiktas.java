package labs_examples.static_nonstatic.labs;

import labs_examples.static_nonstatic.examples.ClassB;

//Please create two classes that demonstrate the following:
//
//1) A static method calling another static method in the same class
//2) A static method calling a non-static method in the same class
//3) A static method calling a static method in another class
//4) A static method calling a non-static method in another class
//5) A non-static method calling a non-static method in the same class
//6) A non-static method calling a non-static method in another class
//7) A non-static method calling a static method in the same class
//8) A non-static method calling a static method in another class

public class ClassBesiktas {
    public static void main(String[] args) {

        gameTactic();
        ClassBesiktas obj = new ClassBesiktas();
        double t = obj.totalSalary(11, 210000);
        System.out.println("Total salary of players is " + t);

        ClassManchester.gameTacticMan();
        ClassManchester obj_1 = new ClassManchester();
        double x = obj_1.averageTime(41, 2655);
        System.out.println("Average time of each player for each game is " + x);

        int fans = numOfFans(20000000);
        System.out.println("Total number of fans of besiktas is " + fans);


    }

    public static void gameTactic() {
        System.out.println("Besiktas game tactic : Ball possession and heavy pressure after lost ball ");
        ClassBesiktas obj_2 = new ClassBesiktas();
        obj_2.gameInstructions();
        int k = numOfFans(20000000);
        System.out.println(k);
        ClassManchester.gameTacticMan();

    }

    public double totalSalary(int numOfPlayers, double playerSalary) {
        return numOfPlayers * playerSalary;
    }

    public void gameInstructions() {
        System.out.println("Only a balance game!");
        double y = totalSalary(11, 540000);
        System.out.println(y);
        ClassManchester obj_3 = new ClassManchester();
        double time = obj_3.averageTime(34, 2450);
        System.out.println(time);

    }

    public static int numOfFans(int fans) {
        return fans;

    }
}
