package labs_examples.objects_classes_methods.labs.objects;

public class typeOfPlane {
    String type;

    public typeOfPlane(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "typeOfPlane{" +
                "type='" + type + '\'' +
                '}';
    }
}
