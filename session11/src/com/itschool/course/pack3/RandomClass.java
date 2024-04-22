package com.itschool.course.pack3;

import com.itschool.course.pack1.SuperClass;

public class RandomClass {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.publicMethod();
        /*superClass.protectedMethod();
        superClass.privateMethod();
        superClass.defaultMethod();*/ // does not compile
    }
}
