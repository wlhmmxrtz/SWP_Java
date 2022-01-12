package at.mow.project.objects;

public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String model;
    public String serialNumber;
    public String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("currently driving...");
    }
}
