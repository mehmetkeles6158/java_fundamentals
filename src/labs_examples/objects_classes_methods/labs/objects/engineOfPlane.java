package labs_examples.objects_classes_methods.labs.objects;

public class engineOfPlane {
    double enginePower;

    public engineOfPlane(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "engineOfPlane{" +
                "enginePower=" + enginePower +
                '}';
    }
}
