package com.itschool.course;

import java.io.File;
import java.io.IOException;

public class Equality2 {

    private static final String CONSTANT = "text2";

    public static void main(String[] args) throws IOException {
        int x = 5; // double equivalent  = 5.0
        double y = 5.1;

        System.out.println(x == y);

        Boolean a = true;
        boolean b = true;

        System.out.println(a.equals(b));

        String nullVar = null;
        String notNullVar = "text";

        System.out.println("Comparing null with not null with ==");
        System.out.println(nullVar == notNullVar);
        System.out.println("Comparing null with not null with equals");
        //System.out.println(nullVar.equals(notNullVar));
        System.out.println("".equals(nullVar));
        System.out.println("Comparing not null with null with equals");
        System.out.println(notNullVar.equals(nullVar));
        System.out.println(CONSTANT.equals(notNullVar));

        File file1 = new File("file1.txt");
        file1.createNewFile();
        System.out.println(file1);
    }
}
