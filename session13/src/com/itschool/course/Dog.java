package com.itschool.course;

public non-sealed class Dog extends Animal {

    public Dog() {
        super("aaa", 10);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        immutableDemo();
    }

    private static void immutableDemo() {
        Animal animal = new Dog("puffy", 5);
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
    }

    private void inhDemo() {
        Dog azor = new Dog();
        //azor.age = 12; //does not work
        //azor.setName("Azor");

        System.out.println(azor.getName());
        azor.eat();
        azor.sleep();
        azor.finalMethod();

        System.out.println("=================");
        Animal animal = new Animal();
        //animal.setName("Bobby");
        System.out.println(animal.getName());
        animal.eat();

        System.out.println("==================");
        Animal dog = new Dog(); // new Animal();
        dog.eat();
        Animal.staticMethod();
        Dog.staticMethod();
        // dog.sleep(); // does not work
        //Dog puffy = new Animal(); // does not work
    }

    public void sleep() {
        System.out.println("The dog is sleeping");
        super.eat();
    }

    @Override
    protected void eat() {
        //super.eat();
        System.out.println("The animal that is eating is a dog");
    }

    @Override
    protected Dog getAnimal() {
        return new Dog();
    }

    protected static void staticMethod() {
        System.out.println("Dog's static method");
    }

    /*@Override
    protected final String finalMethod() {
        return "dogFinalMethod";
    }*/

    @Override
    public String getName() {
        return super.getName() + "ionutz";
    }

    @Override
    public int getAge() {
        return super.getAge() + 10;
    }
}
