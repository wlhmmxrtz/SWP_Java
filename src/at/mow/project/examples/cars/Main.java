package at.mow.project.examples.cars;

import at.mow.project.examples.cars.Car;

public class Main {
    public static void main(String args[]) {

        Engine e1 = new Engine(250, "GASOLINE");

        Car c1 = new Car("red", 255, 9, 65000, e1);

    }
}
