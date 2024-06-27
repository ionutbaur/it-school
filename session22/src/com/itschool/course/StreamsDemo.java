package com.itschool.course;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        //generalDemo();
        //mapDemo();
        exercise();
    }

    public static void exercise() {
        // dintr-o lista de persoane, vreau suma varstelor ale persoanelor care sunt majore
        /*Person person1 = new Person("ionutz", 33);
        Person person5 = new Person("gabi", 20);
        Person person2 = new Person("alex", 26);*/
        Person person3 = new Person("laura", 6);
        Person person4 = new Person("ionela", 16);

        List<Person> personList = List.of(/*person1, person2,*/ person3, person4/*, person5*/);
        Optional<Integer> sumaVarstelor = personList.stream()
                .filter(person -> person.getAge() >= 18)
                .map(Person::getAge)
                .reduce(Integer::sum);
                //.orElseThrow(() -> new IonutzException("Nu am gasit nicio varsta disponibila!"));

        if (sumaVarstelor.isPresent()) {
            System.out.println("Am gasit suma varstelor!");
        } else {
            System.out.println("Nu am gasit suma varstelor!");
        }

        if (sumaVarstelor.isEmpty()) {
            System.out.println("Nu am gasit suma varstelor!");
        } else {
            System.out.println("Am gasit suma varstelor!");
        }

        System.out.println(sumaVarstelor);

    }

    private static void mapDemo() {
        List<String> names = List.of("ionutz", "alex", "mihai", "dalina", "patricia");
        List<Integer> lengths = names.stream()
                .map(s -> s.length())
                .toList();
        System.out.println(lengths);

    }

    private static void generalDemo() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 4);
        Set<Integer> set1 = stream.collect(Collectors.toSet());
        List<Integer> list1 = stream.collect(Collectors.toList());

        Supplier<Stream<Integer>> streamSupplier = () -> Stream.of(1, 2, 3, 4, 4);
        Set<Integer> set = streamSupplier.get().collect(Collectors.toSet());
        List<Integer> list = streamSupplier.get()
                .collect(Collectors.toList());

        System.out.println("set: " + set);
        System.out.println("list: " + list);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers);

        List<Integer> evenNumbersWithStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(evenNumbersWithStream);
    }
}
