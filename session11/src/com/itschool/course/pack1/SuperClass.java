package com.itschool.course.pack1;

import com.itschool.course.House;

import java.io.File;
import java.io.IOException;

public class SuperClass {

    private int sum(int a, int b) {
        return a + b;
    }

    private String getFullName() {
        String firstName = "Ionutz";
        String lastName = "Baur";

        return firstName + " " + lastName;
    }

    private void deleteFromDatabase() {
        // ...
        System.out.println("Deleted from db");
    }

    public void createFile() throws IOException, NullPointerException, Exception, Error {

    }

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        int a = superClass.sum(1, 2);
        System.out.println(a);
        String fullName = superClass.getFullName();
        superClass.deleteFromDatabase();

        superClass.deleteFromDatabase();
        superClass.privateMethod();
    }

    public final void publicMethod() {
        System.out.println("public method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    void defaultMethod() {
        System.out.println("default (package-protected) method");
    }
}
