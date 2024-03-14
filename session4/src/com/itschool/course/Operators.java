package com.itschool.course;

public class Operators {
        public static void main(String[] args) {

            int a = 10;
            int b = 20;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(b / a);
            System.out.println(a / b);
            System.out.println(b % a);
            System.out.println(a % b);

            double c = 4.5d;
            double d = 5.5d;

            System.out.println(c + d);
            System.out.println(c - d);
            System.out.println(c * d);
            System.out.println(c / d);

            System.out.println("--------");

            int e = +11;
            int f = -12;

            System.out.println(e);
            System.out.println(f);

            int num = -25;

            System.out.println(+num);
            System.out.println(-num);

            boolean isFirstTime = true;
            boolean isRegistered = false;

            System.out.println(!isFirstTime);
            System.out.println(!isRegistered);

            int x = 5;
            System.out.println(x++);
            System.out.println(++x);

            int value = 20;
            value %= 50;

            System.out.println(value);

            int ccc = 10;
            ccc += 5;
            //echivalent ccc+5

            System.out.println(ccc);

            System.out.println("-----");

            int u = 5;
            int i = 6;
            System.out.println(u == i);
            System.out.println(u != i);
            System.out.println(u > i);
            System.out.println(u < i);
            System.out.println(u >= i);
            System.out.println(u <= i);

            double w = 15.5;
            int z = 15;

            System.out.println(w > z);
            System.out.println(w <= z);
            System.out.println("------------");

            short j = 10;
            int p = j + 5;

            System.out.println(f);


            double mmm = 15.5;
            int nnn = 15;
            System.out.println(mmm > nnn);
            System.out.println(mmm <= nnn);

            short ff=10;
            int gg=ff+5;

            System.out.println(ff);
            System.out.println(gg);

            byte o=10;
            int jjj=o;
            System.out.println(jjj);

            double hhh=5.5;
            float vvv=(float)hhh;
            System.out.println(vvv);

            int age;
            age=28;
            System.out.println("I am"+" "+age+" "+"years old.");

            int outerVar=100;
            if(outerVar>50){
                int innerVar=200;
                System.out.println(innerVar+outerVar);
            }

        }
    }


