package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Dependency {
    Bikes bikes;

    public Dependency(Bikes bikes) {
        this.bikes = bikes;
    }

    public void testMethods() {
        bikes.discBrake();
        bikes.climb();
        bikes.numberOfGears(10);
        System.out.println("------------------------------------");
    }

    public void setBikes(Bikes bikes) {
        this.bikes = bikes;
    }
}
