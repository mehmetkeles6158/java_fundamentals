package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class CarController {

    public static void main(String[] args) {

        CarFeatures car01 = new CarFeatures();

        car01.setMake("Toyota");
        car01.setModel("Camry");
        car01.setYear(2021);
        car01.setColor("Blue");
        car01.setType("XSE");
        car01.setHp(220);
        System.out.println(car01);
        System.out.println(car01.pushStart());
        car01.acceleration();

    }
}
