package com.itschool.course;

public sealed class Animal permits Cat, Dog {

    private String name;
    private double age;

    private boolean isFeline;
    private boolean hasTail;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + "ionutz";
    }

    public int getAge() {
        return (int) Math.max(age, 0);
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void eat() {
        System.out.println("The animal is eating");
    }

    protected Animal getAnimal() {
        return this;
    }

    protected static void staticMethod() {
        System.out.println("Animal's static method");
    }

    protected final String finalMethod() {
        return "finalMethod";
    }

    public boolean isFeline() {
        return isFeline;
    }

    public void setFeline(boolean feline) {
        isFeline = feline;
    }

    public boolean hasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
