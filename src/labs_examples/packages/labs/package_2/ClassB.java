package labs_examples.packages.labs.package_2;

import labs_examples.packages.labs.package_1.ClassA;


public class ClassB extends ClassA {

    // Only created for showing " sub class in different package can access protected method in other package."
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.display();
    }

}
