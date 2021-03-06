package at.mow.project.examples.cars;

public class Engine {
    private int power;
    public enum FUEL {DIESEL, GASOLINE}
    private FUEL fuelType;

    public Engine(int power, FUEL fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public FUEL getFuelType() {
        return fuelType;
    }

    public void setFuelType(FUEL fuelType) {
        this.fuelType = fuelType;
    }
}
