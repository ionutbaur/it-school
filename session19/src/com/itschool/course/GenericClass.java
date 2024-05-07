package com.itschool.course;

public class GenericClass<T> {

    private String name;
    private T type;

    public GenericClass(T type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
