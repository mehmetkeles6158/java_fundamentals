package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 * <p>
 * 1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 * 2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 * of this enum from a seperate class.
 */


public class Exercise_01 {
    //1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.

    static class Controller {

        public static void main(String[] args) {
            for (FirstExample.roleOfPlayers p : FirstExample.roleOfPlayers.values()) {
                System.out.print(p + " has the role of " + p.name() +
                        '\n');
            }
        }

    }

//1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.

    public static class FirstExample {

        private enum roleOfPlayers {
            ATTACKER, DEFENDER, WINGER, MIDFILLER

        }

    }

    //2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
    // * of this enum from a seperate class.

    public static class EnumParameterizedLab {

        public enum ChampionTeams {
            BESIKTAS(16), GS(14), BARCELONA(18), FB(10);

            ChampionTeams(int numsOfTitles) {
                this.numOfTitles = numsOfTitles;
            }

            private final int numOfTitles;

            public int getNumOfTitles() {
                return numOfTitles;
            }
        }


    }

    //2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
    // * of this enum from a seperate class.

    public static class UsingParameterizedEnum {
        public static void main(String[] args) {
            for (EnumParameterizedLab.ChampionTeams c : EnumParameterizedLab.ChampionTeams.values()) {
                System.out.print("Championship: " + c + ", ");
                if (c.getNumOfTitles() >= 15) {
                    System.out.print("It is a big club, ");
                } else {
                    System.out.print("It is not a big club, ");
                }
                switch (c) {
                    case BARCELONA:
                        System.out.println("But watching BARCA' games is enjoyable.");
                        continue;
                    case BESIKTAS:
                        System.out.println("Besiktas has compact game plan.");
                        continue;
                    default:
                        System.out.println("their tactics are ok.");
                }
            }
        }

    }


}



