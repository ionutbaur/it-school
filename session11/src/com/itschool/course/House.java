package com.itschool.course;

public class House {

    public static int counter = 30;

    static {
        counter = 20;
        System.out.println("In aer!");
    }

    public House() {
    }

    private String color;
    private int mp;

    private String name;

    private int wallsNo;
    private int doorsNo;

    public House(String color,
                 int mp) {
        this.color = color;
        this.mp = mp;
    }

    public House(String color) {
        this(color, 10);
    }

    public String getColor() {
        return color;
    }

    public int getMp() {
        return this.mp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int mpUtils() {
        return mp - 10;
    }

    public static int totalCost(int electricity, int gaz) {
        return electricity + gaz;
    }

    public int getTotalCostFromSuper(int electricy, int gaz) {
        return Constructie.totalCost(electricy, gaz);
    }

    public void callMpUtils() {
        int utils = this.mpUtils();
    }

    public void versusHouse(House otherHouse) {
        //setName("my house");
        System.out.println(this.getName() + " vs " + otherHouse.getName());
    }

    public void callVersusHouse() {
        versusHouse(this);
    }

    public House withWallsNo(int wallsNo) {
        this.wallsNo = wallsNo;
        return this;
    }

    public House withDoorsNo(int doorsNo) {
        this.doorsNo = doorsNo;
        return this;
    }

    public int getWallsNo() {
        return wallsNo;
    }

    public int getDoorsNo() {
        return doorsNo;
    }
}
