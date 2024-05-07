package com.itschool.course;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private long cnp;

    public Person(String name, long cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public long getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cnp=" + cnp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (cnp != person.cnp) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (cnp ^ (cnp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Person that) {
        return this.name.compareTo(that.getName());
    }
}
