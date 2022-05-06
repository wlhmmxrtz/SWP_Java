package at.mow.project.examples.cars;

public class Producer {
    private String name;
    private String model;
    private String country;
    private double discount;

    public Producer(String name, String model, String country, double discount) {
        this.name = name;
        this.country = country;
        this.discount = discount;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
