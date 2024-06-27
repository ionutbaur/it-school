package com.itschool.course;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        //optionalDemo();
        //methodRefDemo();
        //staticMethodRefDemo();
        //instanceMethodRefWithVar();
        //instanceMethodRefWithNonStaticMethod();
        //superClassMethodRef();
        constructorReference();
    }

    private static void staticMethodRefDemo() {
        Function<String, Integer> parseInt = Integer::parseInt;
        Integer result = parseInt.apply("10");
        System.out.println(result);
    }

    private static void instanceMethodRefWithVar() {
        String str = "Hello World!";
        Supplier<Integer> supplier = str::length;
        Integer length = supplier.get();
        System.out.println(length);
    }

    private static void instanceMethodRefWithNonStaticMethod() {
        BiFunction<String, String, Boolean> equalsFunction = String::equals;
        boolean isEqual = equalsFunction.apply("ionutz", "test");
        System.out.println(isEqual);
    }

    private static void superClassMethodRef() {
        Subclass subclass = new Subclass();
        subclass.execute();
    }

    private static void constructorReference() {
        Supplier<StringBuilder> supplier = StringBuilder::new;
        StringBuilder stringBuilder = supplier.get();
        stringBuilder.append("ionutz").append(15);

        System.out.println(stringBuilder);
    }

    private static void methodRefDemo() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        //list.forEach(number -> System.out.println(number));
        list.forEach(System.out::println);
    }

    private static void optionalDemo() {
        String text = null;
        Optional<String> optionalString = Optional.ofNullable(text);

        int length = optionalString.orElse("not found").length();
        System.out.println(length);
    }
}
