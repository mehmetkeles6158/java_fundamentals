package labs_examples.fundamentals.examples.variables;

public class variables {
    //global variable
    static double val = 110.35;

    public static void main(String[] args) {

        Person myPerson = new Person("Mehmet",32) ;
        Person yourPerson = new Person("Lincoln",200) ;
        Person batmanBegins = new Person("Bruce Wayne",40);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(batmanBegins.toString());

        double x = multiply(val,2);
    }

    public static double multiply(double a, double b){
        double result = a * b;
        printNum(result);
        return result;
    }

    public static void printNum(double numToPrint){

        System.out.println("This is a secret number:"+ numToPrint);

    }




}
