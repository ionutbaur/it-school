package com.itschool.course;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ionutz");
        sb.append("baur");
        sb.append("it-school");
        StringBuilder lastStringBuilder = sb.append(11).append("ceva").append("blabla").append(5.9);
        //System.out.println(lastStringBuilder);
        sb.append("course");
        sb.append("text");

        sb.insert(2, "aa");
        System.out.println(lastStringBuilder);
        sb.delete(5, 10);
        sb.reverse();

        String text = sb.toString();
        System.out.println(text);

        //System.out.println(sb);
    }
}
