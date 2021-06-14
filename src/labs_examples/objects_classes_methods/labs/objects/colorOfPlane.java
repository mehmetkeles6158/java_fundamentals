package labs_examples.objects_classes_methods.labs.objects;

public class colorOfPlane {
    String color;

    public colorOfPlane(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "colorOfPlane{" +
                "color='" + color + '\'' +
                '}';
    }
}
