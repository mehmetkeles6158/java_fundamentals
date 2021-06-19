package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class BikesController {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        mountain.discBrake();
        mountain.numberOfGears(10);
        mountain.climb();

        System.out.println("--------------------------------------------------------");

        Hybrid hybrid = new Hybrid();
        hybrid.discBrake();
        hybrid.numberOfGears(21);
        hybrid.climb();




    }
}
