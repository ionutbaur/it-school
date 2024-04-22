package com.itschool.course;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long cnp;

    public Person() {
    }

    public Person(String lastName, long cnp) {
        this.lastName = lastName;
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }
}
