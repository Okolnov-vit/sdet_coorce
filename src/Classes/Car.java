package Classes;

import AbstractClass.Vehicle;
import Interface.Drivable;
import Interface.FuelEfficiency;

public class Car extends Vehicle implements Drivable, FuelEfficiency {
    private int doors;  // число дверей
    private double fuelConsumption;  // расход топлива на 100 км

    public Car(String brand, String model, int doors, double fuelConsumption) {
        super(brand, model);
        this.doors = doors;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Model: " + model + ", Doors: " + doors);
    }

    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }

    @Override
    public double calculateFuelEfficiency(double distance) {
        return (distance / 100) * fuelConsumption;
    }

    public int getDoors() {
        return doors;
    }
}
// Lesson_1-2