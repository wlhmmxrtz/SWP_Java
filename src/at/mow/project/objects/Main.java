package at.mow.project.objects;

import at.mow.project.objects.Car;




public class Main {
    public static void main(String args[]) {

        //Engine e1 = new Engine(250, "V8", "GASOLINE");

        Car c4 = new Car(17, 102,322, "Lotus", "Esprit", "LE1234", "dark metallic green");

        System.out.println("the car " + c4.getBrand() + " " + c4.getModel() + " " + c4.getSerialNumber() + " has the color " + c4.getColor());

    }
}
