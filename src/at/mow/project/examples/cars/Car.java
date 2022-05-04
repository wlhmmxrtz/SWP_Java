package at.mow.project.examples.cars;

import at.mow.project.examples.cars.Engine;

import at.mow.project.examples.cars.Producer;

public class Car {
    private String color;
    private int maxSpeed;
    private int baseFuelConsumption;
    private int basePrice;
    private Engine engine;
    private Producer producer;


    public Car(String color, int maxSpeed, int baseFuelConsumption, int basePrice, Engine engine, Producer producer){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.baseFuelConsumption = baseFuelConsumption;
        this.basePrice = basePrice;
        this.engine = engine;
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBaseFuelConsumption() {
        return baseFuelConsumption;
    }

    public void setBaseFuelConsumption(int baseFuelConsumption) {
        this.baseFuelConsumption = baseFuelConsumption;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void price() {
        double rabatt = this.producer.getDiscountPercent()/100;
        double price = this.basePrice-(this.basePrice * rabatt);

        System.out.println("Der Endpreis beträgt " + price);
    }
}
