package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class CarFeatures extends Car {

    private String type;
    private int hp;

    public CarFeatures(String make, String model, String color, int year, String type, int hp) {
        super(make, model, color, year);
        this.type = type;
        this.hp = hp;
    }

    public CarFeatures() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "CarFeatures{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", hp=" + hp +
                '}';
    }
}
