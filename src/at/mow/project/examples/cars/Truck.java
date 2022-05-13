package at.mow.project.examples.cars;

public class Truck extends Car{

    private double loadingCapacity;

    public Truck(String color, int maxSpeed, int baseFuelConsumption, int basePrice, Engine engine, Producer producer, int milage, double loadingCapacity) {
        super(color, maxSpeed, baseFuelConsumption, basePrice, engine, producer, milage);

        this.loadingCapacity = loadingCapacity;
    }

    public double getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}
