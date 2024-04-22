package com.itschool.course;

public class VariablesDemo {

    private String instanceVar;
    private static String staticVar;

    public void demo() {
        instanceVar = "text";
        staticVar = "text2";
        String localVar = "text3";
    }

    public void demo2() {
        instanceVar = "demo2Instance";
        staticVar = "demo2StaticVar";
        String localVar = "demo2LocalVar";
        String instanceVar = "instance2";
        System.out.println(instanceVar);
    }

    public String getInstanceVar() {
        instanceVar = "instanceValue " + this;
        return instanceVar;
    }

    public static String getStaticVar() {
        if (staticVar == null) {
            staticVar = "staticValue";
            System.out.println("First time here!");
        } else {
            System.out.println("Not needed. I already have the value " + staticVar);
        }

        return staticVar;
    }
}
