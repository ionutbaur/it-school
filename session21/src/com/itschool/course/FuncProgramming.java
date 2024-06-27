package com.itschool.course;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FuncProgramming {

    public static void main(String[] args) {
        lambdaDemo();
        //predicateDemo();
        //consumerDemo();
        //supplierDemo();
        //functionDemo();
    }

    private static void predicateDemo() {
        Predicate<String> stringPredicate = text -> text.length() == 6;
        boolean isLengthMatched = stringPredicate.test("ionutz");
        System.out.println(isLengthMatched);

        Predicate<Integer> integerPredicate = number -> number == 10;
        boolean isIntMatched = integerPredicate.test(10);
        System.out.println(isIntMatched);

        IntPredicate intPredicate = number -> number == 10;
        System.out.println(intPredicate.test(10));
    }

    private static void consumerDemo() {
        Consumer<String> stringConsumer = word -> System.out.println(word.length());
        stringConsumer.accept("it-school");
        stringConsumer.accept("ionutz");

        List<String> list = List.of("ionutz", "gabriel", "baur");
        for (String name : list) {
            System.out.println(name.length());
        }

        System.out.println("==============");
        list.forEach(name -> System.out.println(name.length()));
    }

    private static void supplierDemo() {
        // dummy in this case
        Supplier<String> stringSupplier = () -> "ionutz";
        String result = stringSupplier.get();
        System.out.println(result);

        Supplier<Integer> randomIntSupplier = () -> {

            return new Random().nextInt(100);
        };
        /*int number = randomIntSupplier.get();
        System.out.println(number);*/

        myMethod(randomIntSupplier);
    }

    private static void functionDemo() {
        Function<String, Integer> function = text -> text.length();
        int result = function.apply("baur");
        System.out.println(result);

        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        String upper = unaryOperator.apply("ionutz");
        System.out.println(upper);
    }

    private static void myMethod(Supplier<Integer> supplier) {
        int number = supplier.get();

        System.out.println(number);
    }

    private static void lambdaDemo() {
        // traditional
        Reader readerTraditional = new ReaderImpl();
        String tradRead = readerTraditional.read(1, 2);

        System.out.println(tradRead);

        // anonymous inner class
        Reader anonymousReader = new Reader() {

            @Override
            public String read(int a, int b) {
                return null;
            }
        };
        String anRead = anonymousReader.read(1, 2);
        System.out.println(anRead);

        // lambda expression - implementation
        Reader lambdaReader = (a, b) -> "What a beautiful day. And sum of numbers: " + (a + b);
        lambdaReader.readLouder();
        String lambRead = lambdaReader.read(1, 2); // apply "read" method
        System.out.println(lambRead);
    }

    public static class InnerClass {
        private String name;
    }
}
