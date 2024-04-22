package com.itschool.recap.oop.ex8;

public class TrafficSimulation {
    public static void main(String[] args) {
        // Create instances of different types of vehicles
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();

        // Simulate traffic
        simulateTraffic(car);
        simulateTraffic(truck);
        simulateTraffic(motorcycle);
    }

    // Method to simulate traffic
    private static void simulateTraffic(Vehicle vehicle) {
        // Start the vehicle
        vehicle.start();

        // Accelerate the vehicle
        vehicle.accelerate();

        // Stop the vehicle
        vehicle.stop();

        System.out.println(); // Empty line for readability
    }
}
