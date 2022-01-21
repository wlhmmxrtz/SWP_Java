package at.mow.project.objects;
import at.mow.project.objects.Car;

public class Main {
    public static void main(String args[]) {

     /*   Car c1 = new Car();
        c1.brand = "Lotus";
        c1.model = "Esprit";
        c1.serialNumber = "LE1234";
        c1.color = "white";
        c1.fuelConsumption = 10;
        c1.fuelAmount = 72;
        c1.fuelVolume = 200;

        Car c2 = new Car();
        c2.brand = "Renault";
        c2.model = "Alpine A310";
        c2.serialNumber = "RA31012";
        c2.color = "bright red";
        c2.fuelConsumption = 8;
        c2.fuelAmount = 45;
        c2.fuelVolume = 120;

        Car c3 = new Car();
        c3.brand = "Lamborghini";
        c3.model = "Countach";
        c3.serialNumber = "LC2512";
        c3.color = "white";
        c3.fuelConsumption = 19;
        c3.fuelAmount = 96;
        c3.fuelVolume = 250;
*/
        Car c4 = new Car(17, 102,322, "Ford", "Raptor", "FR3342", "blue");

        System.out.println(c4.brand + " " + c4.model + " " + c4.serialNumber);

/*
        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
        c1.brake();
        c1.turboBoost();
        c1.honk();
        c1.getRemainingRange();

*/
    }
}
