package com.itschool.course;

public class Course14Main {

    public static void main(String[] args) {
        Car oldCar = new OldCar();
        oldCar.run();
        System.out.println("========== modern car");

        Car modernCar = new BrandNewCar();
        modernCar.run();

        AbstractClassWithoutAbstractMethods abstractClass = new AbstractClassWithoutAbstractMethods() {
            @Override
            public void displaySmth() {
                super.displaySmth();
            }
        };

        System.out.println("======== interface");
        MyInterface myInterface = new MyConcreteClass();
        myInterface.printFromInterface2();
        String myVar = MyInterface.BANK_NAME;
    }
}
