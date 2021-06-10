package labs_examples.fundamentals.examples.variables_scope;

public class VariableScope {
    static int globalVar =10;

    public static void main(String[] args) {
        int x = multiply(3,9);
        System.out.println(x);
    }

    public static int multiply(int a, int b){
        int result = a * b * globalVar/10;
        return result;
    }

    public static int divide(int a, int b) {
        int val = globalVar/ a / b;
        return val;
    }
}
