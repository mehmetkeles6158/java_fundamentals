package labs_examples.objects_classes_methods.examples;

public class practices {
    public static void main(String[] args) {
        boolean check = isOdd(17);
        System.out.println(check);

    }

    // please write a static isOdd() method that takes one numeric
    // parameter and returns a true (boolean) if the parameter is odd

    public static boolean isOdd(int i) {
            if ( i % 2 == 1) {
                boolean odd = true;
                return true;
            } else{
                boolean notOdd = false;
            }
            return false ;
        }
    }







    // please write a method that will take in a String (as an argument)
    // and return that String in reverse order. For instance, if you pass
    // in the String "programming is cool" the method will return the
    // String "looc si gnimmargorp"

