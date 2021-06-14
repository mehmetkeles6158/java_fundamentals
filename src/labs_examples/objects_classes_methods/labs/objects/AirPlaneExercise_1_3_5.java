package labs_examples.objects_classes_methods.labs.objects;

public class AirPlaneExercise_1_3_5 {
    engineOfPlane engineP;
    colorOfPlane colorP;
    typeOfPlane typeP;
    capacityOfPlane capacityP;
    double fuelCapacity;
    String currentFuelLevel;

    public AirPlaneExercise_1_3_5(engineOfPlane engineP, colorOfPlane colorP, typeOfPlane typeP, capacityOfPlane capacityP, double fuelCapacity, String currentFuelLevel) {
        this.engineP = engineP;
        this.colorP = colorP;
        this.typeP = typeP;
        this.capacityP = capacityP;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public engineOfPlane getEngineP() {
        return engineP;
    }

    public void setEngineP(engineOfPlane engineP) {
        this.engineP = engineP;
    }

    public colorOfPlane getColorP() {
        return colorP;
    }

    public void setColorP(colorOfPlane colorP) {
        this.colorP = colorP;
    }

    public typeOfPlane getTypeP() {
        return typeP;
    }

    public void setTypeP(typeOfPlane typeP) {
        this.typeP = typeP;
    }

    public capacityOfPlane getCapacityP() {
        return capacityP;
    }

    public void setCapacityP(capacityOfPlane capacityP) {
        this.capacityP = capacityP;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(String currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "AirPlaneExercise_1{" +
                "engineP=" + engineP.toString() +
                ", colorP=" + colorP.toString() +
                ", typeP=" + typeP.toString() +
                ", capacityP=" + capacityP.toString() +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        engineOfPlane planeEngine = new engineOfPlane(1200);
        colorOfPlane planeColor = new colorOfPlane("white");
        typeOfPlane planeType = new typeOfPlane("Boeing-77");
        capacityOfPlane planeCapacity = new capacityOfPlane(300);
        AirPlaneExercise_1_3_5 myPlane = new AirPlaneExercise_1_3_5(planeEngine, planeColor, planeType, planeCapacity, 200, "low");

        System.out.println("I usually fly with " + myPlane.colorP.color + " " + myPlane.typeP.type + " with "
                + myPlane.capacityP.passengerCapacity + " passenger capacity and " + myPlane.engineP.enginePower + " megaWatt engine power. " + "It takes " + myPlane.fuelCapacity + " gallons of Jet fuel. " + "And its tank' level gets " + myPlane.currentFuelLevel
                + " when it arrives its destination!");
        System.out.println(myPlane.toString());
    }
}
