package at.mow.project.examples.cars;

import java.util.Scanner;


public class Main {
    public static void main(String args[]) {

        Engine e1 = new Engine(250, Engine.FUEL.GASOLINE);

        Producer p1 = new Producer("Audi", "Q3 Sportback", "Germany", 0.08);

        Engine e2 = new Engine(800, Engine.FUEL.DIESEL);

        Producer p2 = new Producer( "MAN", "8x8", "Germany", 0.1);

        Engine r1 = new Engine(1200, Engine.FUEL.GASOLINE);

        Producer renault = new Producer("Renault F1 Team", "R25", "England", 0.0);

        Car c1 = new Car("red", 255, 9, 65000, e1, p1, 60);

        Truck t1 = new Truck("green",100, 25, 250000, e2, p2,12300, 25);

        Racecar r25 = new Racecar("yellow", 350, 12, 12000000, r1, renault, 725);


     c1.getPrice();

     c1.getFuelEfficiency();

     c1.drive();
    }
}
