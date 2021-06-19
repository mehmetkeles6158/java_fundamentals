package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Hybrid implements Bikes {
    @Override
    public boolean discBrake() {
        System.out.println("Hybrid Bikes don't have disc brakes!");
        return false;
    }

    @Override
    public void climb() {
        System.out.println("They don't have a functionality to climb.");

    }

    @Override
    public void numberOfGears(int gears) {
        System.out.println("They have " + gears + " gears in total.");

    }
}
