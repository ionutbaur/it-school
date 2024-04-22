package com.itschool.course;

public class Engine {

    private String vin;

    public Engine(String vin) {
        this.vin = vin;
    }

    public void start() {
        System.out.println("Start engine");
    }
}
