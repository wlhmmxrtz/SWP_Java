package at.mow.project.examples.cars;

public class Racecar extends Car{

    private String wing;

    public Racecar(String color, int maxSpeed, int baseFuelConsumption, int basePrice, Engine engine, Producer producer, int milage, String wing) {
        super(color, maxSpeed, baseFuelConsumption, basePrice, engine, producer, milage);

        this.wing = wing;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
}
