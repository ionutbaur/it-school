package com.itschool.course.pack1;

public class SubClassSamePack {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        // superClass.privateMethod(); //does not compile
        superClass.defaultMethod();
        superClass.protectedMethod();
        superClass.publicMethod();
    }
}
