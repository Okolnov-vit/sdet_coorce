package Classes;

import AbstractClass.Vehicle;
import Interface.Drivable;
import Interface.FuelEfficiency;

public class Truck extends Vehicle implements Drivable, FuelEfficiency {
    private double payloadCapacity;  // грузоподъемность
    private double fuelConsumption;  // расход топлива на 100 км

    public Truck(String brand, String model, double payloadCapacity, double fuelConsumption) {
        super(brand, model);
        this.payloadCapacity = payloadCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Brand: " + brand + ", Model: " + model + ", Payload Capacity: " + payloadCapacity + " tons");
    }

    @Override
    public void drive() {
        System.out.println("Driving the truck...");
    }

    @Override
    public double calculateFuelEfficiency(double distance) {
        return (distance / 100) * fuelConsumption;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }
}
// Lesson_1-2