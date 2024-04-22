package com.itschool.course;

public class CompositionMain {

    public static void main(String[] args) {
        Engine engine = new Engine("some vin");
        engine.start();
        Car car = new Car(engine);
        Engine engine1 = car.getEngine();
        engine1.start();
    }
}
