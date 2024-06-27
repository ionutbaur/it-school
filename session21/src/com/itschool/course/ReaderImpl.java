package com.itschool.course;

public class ReaderImpl implements Reader {

    @Override
    public String read(int a, int b) {
        return "What a beautiful day from ReaderImpl" + (a + b);
    }
}
