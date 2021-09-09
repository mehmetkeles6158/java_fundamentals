package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Car implements VehicleFunctions {
    protected String make;
    protected String model;
    protected String color;
    protected int year;

    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean pushStart() {
        return true;
    }

    @Override
    public void acceleration() {
        System.out.println("It accelerates up to 60 mph in 3 seconds!");
    }
}
