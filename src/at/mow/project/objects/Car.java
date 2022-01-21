package at.mow.project.objects;

import java.util.Scanner;

public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public int fuelVolume;
    public String brand;
    public String model;
    public String serialNumber;
    public String color;


    public Car(int fuelConsumption, int fuelAmount, int fuelVolume, String brand, String model, String serialNumber, String color){
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.fuelVolume = fuelVolume;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println(serialNumber + " Is currently diving");
    }
    public void brake(){
        String brake;
        brake = "Ich bremse";
        System.out.println(brake);
    }

    public void turboBoost(){
        if(fuelVolume*0.1 < fuelAmount){
            System.out.println("SuperBoostMode activated");
        } else{
            System.out.println("Not enough fuel to go to Superboost.");
        }
    }

    public void honk(){
        System.out.println("Please enter the Amount of times you want to honk");
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        for (int amountOfRepetitions = 0;  amountOfRepetitions < amount; amountOfRepetitions++) {
            System.out.println("TUUUUUUUUUUUT");
        }
    }

    public void getRemainingRange(){
        int remainingRange = this.fuelAmount/fuelConsumption;
        System.out.println("There are about " + remainingRange*100 + "km of Range remaining");
    }


}
