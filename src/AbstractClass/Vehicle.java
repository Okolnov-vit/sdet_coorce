package AbstractClass;

public abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();  // абстрактный метод

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}