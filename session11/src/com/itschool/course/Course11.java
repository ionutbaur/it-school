package com.itschool.course;

public class Course11 {

    public static void main(String[] args) {
        //varsDemo();
        //classDemo();
        //Constructor constructor = new Constructor();
        //sameHouse();
        thisReturnedDemo();
    }

    private static void classDemo() {
        House myHouse = new House("blue", 100);
        myHouse.setColor("orange");

        House sebiHouse = new House("red", 200);
        House lorenaHouse = new House("pink", 300);
        // type instanceName = object

        House nonArgsHouse = new House();
        nonArgsHouse.setMp(30);
        System.out.println("Setting color============================");
        nonArgsHouse.setColor("black");
        System.out.println(nonArgsHouse.getColor());

        House oneArgHouse = new House("white");

        int mpUtils = sebiHouse.mpUtils();
        System.out.println("Mp utils: " + mpUtils);

        int totalCost = House.totalCost(150, 200);
        System.out.println("Total cost: " + totalCost);

        int totalCostWithInstance = myHouse.totalCost(200, 300);
        System.out.println(totalCostWithInstance);
    }

    private static void varsDemo() {
        VariablesDemo demo1 = new VariablesDemo();
        System.out.println(demo1.getInstanceVar());
        System.out.println(VariablesDemo.getStaticVar());

        System.out.println("======================");
        VariablesDemo demo2 = new VariablesDemo();
        System.out.println(demo2.getInstanceVar());
        System.out.println(VariablesDemo.getStaticVar());

        /*Course11 course11 = new Course11();
        course11.nonStaticMethod();

        Course11.nonStaticMethod();*/
        Course11.staticMethod();
        int houseStaticString = House.counter;
        House.counter = 4;
        System.out.println(houseStaticString);
    }

    private void nonStaticMethod() {
        Constructie.totalCost(5, 20);
        staticMethod(); //works
    }

    private static void staticMethod() {
        Constructie.totalCost(5, 20);
        // nonStaticMethod(); //does not work
    }

    private static void sameHouse() {
        House house = new House();
        house.setName("my house");

        house.callVersusHouse();
        System.out.println("===========");

        House house2 = new House();
        house2.setName("vecinul");
        house.versusHouse(house2);
    }

    private static void thisReturnedDemo() {
        House house = new House("yellow")
                .withWallsNo(10)
                .withDoorsNo(4);

        System.out.println(house.getColor());
        System.out.println(house.getWallsNo());
        System.out.println(house.getDoorsNo());
    }
}
