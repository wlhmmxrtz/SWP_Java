package at.mow.project.objects;
import at.mow.project.objects.Car;

public class Main {
    public static void main(String args[]) {

        Car c1 = new Car();
        c1.brand = "Lotus";
        c1.model = "Esprit";
        c1.serialNumber = "LE1234";
        c1.color = "white";
        c1.fuelConsumption = 10;
        c1.fuelAmount = 72;

        Car c2 = new Car();
        c2.brand = "Renault";
        c2.model = "Alpine A310";
        c2.serialNumber = "RA31012";
        c2.color = "bright red";
        c2.fuelConsumption = 8;
        c2.fuelAmount = 45;

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);



    }
}
