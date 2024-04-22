package com.itschool.course;

public record Rectangle(int length, int width) {

    private void test() {
        System.out.println("bla bla");
    }

    public void publicMethod() {
        test();
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}
