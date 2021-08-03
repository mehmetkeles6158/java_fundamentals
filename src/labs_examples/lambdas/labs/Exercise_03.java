package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * Lambdas Exercise 3:
 * <p>
 * 1) Demonstrate the use of a static method reference
 * 2) Demonstrate the use of an instance method reference
 * 3) Demonstrate the use of a constructor reference
 */
public class Exercise_03 {

    // 1) Demonstrate the use of a static method reference
    static class StaticMethod {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> result = StaticMethod::add;

            int answer = result.apply(5, 12);
            System.out.println(answer);
        }

        public static int add(int a, int b) {
            return a + b;
        }

    }


    // 2) Demonstrate the use of an instance method reference
    static class InstanceMethod {

        @FunctionalInterface
        interface InsInterface {
            void try01();
        }

        public void exampleMethod() {
            System.out.println("Today is Sunday. It is best day!");
        }

        public static void main(String[] args) {

            InstanceMethod obj = new InstanceMethod();
            InsInterface ref = obj::exampleMethod;
            ref.try01();

            //Second Example
            String[] teams = {"Besiktas", "Chelsea", "PSG", "ManCity", "Nepali"};

            Arrays.sort(teams, String::compareToIgnoreCase);
            for (String t : teams) {
                System.out.println(t);
            }
        }
    }

    // 3) Demonstrate the use of a constructor reference


    static class ConstructorClass{

        @FunctionalInterface
        interface InfoCreate {
            TeamInfo nameAndYear(String teamName, int year);
        }

        public static void main(String[] args) {

            InfoCreate info01 = TeamInfo::new;
            TeamInfo besiktas = info01.nameAndYear("Besiktas",1903);
            System.out.println(besiktas);

        }

        static class TeamInfo{
            String teamName;
            int foundationYear;

            public TeamInfo(String teamName, int foundationYear) {
                this.teamName = teamName;
                this.foundationYear = foundationYear;
            }

            @Override
            public String toString() {
                return "TeamInfo{" +
                        "teamName='" + teamName + '\'' +
                        ", foundationYear=" + foundationYear +
                        '}';
            }
        }

    }


}