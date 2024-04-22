package com.itschool.course;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        //vehicle.run();
        computeInstance(vehicle);

        Bike bike = new Bike();
        /*bike.pedal();
        bike.run();*/
        computeInstance(bike);

        Vehicle bikeVehicle = new Bike();
        // bikeVehicle.pedal(); doesn't work
        bikeVehicle.run();
        int wheels = bikeVehicle.wheels;
        computeInstance(bikeVehicle);

        Bike bike2 = (Bike) bikeVehicle;
        bike2.pedal();
        computeInstance(bike2);

        Bike bike3 = (Bike) vehicle;
        bike3.pedal();
    }

    private static void computeInstance(Vehicle vehicle) {
        if (vehicle instanceof Bike bike) {
            System.out.println("Instance of Bike!");
            ((Bike) vehicle).pedal();
            bike.pedal();
        } else {
            System.out.println("Not an instance of Bike!");
        }
    }
}
