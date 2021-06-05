package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 * <p>
 * Write the necessary code to calculate the volume and surface area of a cylinder
 * with a radius of 3.14 and a height of 5. Print out the result.
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        // Volume of The Cylinder
        double pi = 3.14; // I used 3.14 as Pi
        double r = 3.14;
        int h = 5;
        double volumeOfCylinder = pi * r * r * h;
        System.out.println(volumeOfCylinder);

        // to cast volume(it is double value) into "int value"(I did this extra:)
        double actualAnswer = 154.79572000000002;
        int castAnswer = (int) actualAnswer;
        System.out.println(castAnswer);

        // Surface Area of The Cylinder
        double surfaceArea = 2 * Math.PI * r * h;
        System.out.println(surfaceArea);

        //To round "final answer of surface area" to the nearest whole number!" I did this extra.:)
        System.out.println(Math.round(surfaceArea));

        // working on flow


        int i = 10;
        if (i > 10) {
            System.out.print("Lorem");
            if (i > 10) {
                System.out.print(" Ipsum");
            } else if (i > 5) {
                System.out.print(" Dolor");
            }
            System.out.print(" Sit");
            if (i >= 10) {
                System.out.print(" Amet");
            }
            System.out.print(" Consectetur");
        }
    }


}
