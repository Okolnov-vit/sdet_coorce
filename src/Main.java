import Classes.Car;
import Classes.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4, 6.5);
        Truck truck = new Truck("Volvo", "FH", 18, 12.0);

        car.displayInfo();
        car.drive();
        System.out.println("Fuel consumption for 200 km: " + car.calculateFuelEfficiency(200) + " liters");

        truck.displayInfo();
        truck.drive();
        System.out.println("Fuel consumption for 200 km: " + truck.calculateFuelEfficiency(200) + " liters");
    }
}

// Lesson_1-2