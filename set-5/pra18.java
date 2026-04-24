import java.util.Scanner;

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuel;

    Car(String fuel) {
        this.fuel = fuel;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuel;

    Bike(String fuel) {
        this.fuel = fuel;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 2;
    }
}

public class pra18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car fuel type (Petrol/Diesel): ");
        String carFuel = sc.nextLine();

        System.out.print("Enter Bike fuel type: ");
        String bikeFuel = sc.nextLine();

        Vehicle car = new Car(carFuel);
        Vehicle bike = new Bike(bikeFuel);

        System.out.println("\nCar Details:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Wheels: " + car.noOfWheels());

        System.out.println("\nBike Details:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Wheels: " + bike.noOfWheels());
    }
}