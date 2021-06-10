package labs_examples.fundamentals.examples.casting;

public class NarrowingConversions {
    public static void main(String[] args)
    {
        double x = 1234578.99;
        // double "x" is being casted to an (int) "z" below
        System.out.println("x =" + x);
        float f =(float)x;
        System.out.println("f =" + f);
        int z = (int)x;
        // more examples
        System.out.println("z =" + z);
        double d = 100.04;
        System.out.println("d =" + d);
        // cast double "d" to long "l" - explicit type casting required
        long l = (long)d;
        // cast long "l" to int "i" - explicit type casting required
        int i = (int)l;
        System.out.println("Long value " + l);
        System.out.println("int value " + i);
    }

}
