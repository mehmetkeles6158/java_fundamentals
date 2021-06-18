package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Mountain implements Bikes {
    @Override
    public boolean discBrake() {
        System.out.println("They have disc brakes!");
        return false;
    }

    @Override
    public void climb() {
        System.out.println("They have climbing feature!");

    }

    @Override
    public void numberOfGears(int gears) {
        System.out.println("They have " + gears + " gears total.");

    }
}
