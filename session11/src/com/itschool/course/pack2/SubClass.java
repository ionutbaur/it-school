package com.itschool.course.pack2;

import com.itschool.course.pack1.SuperClass;

public class SubClass extends SuperClass {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.publicMethod();
        subClass.protectedMethod();
        // subClass.privateMethod(); // does not compile
        // subClass.defaultMethod(); // does not compile
    }


}
