package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class DependencyController {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        Hybrid hybrid = new Hybrid();

        Dependency example = new Dependency(mountain);
        example.testMethods();

        example.setBikes(hybrid);
        example.testMethods();

    }
}
