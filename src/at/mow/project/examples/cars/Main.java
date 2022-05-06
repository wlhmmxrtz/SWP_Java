package at.mow.project.examples.cars;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Engine e1 = new Engine(250, Engine.FUEL.GASOLINE);

        Producer p1 = new Producer("Audi", "Q3 Sportback", "Germany", 0.08);

        Car c1 = new Car("red", 255, 9, 65000, e1, p1, 60);


     c1.getPrice();

     c1.getFuelEfficiency();

     c1.drive();
    }
}
