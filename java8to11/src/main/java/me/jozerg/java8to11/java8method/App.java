package me.jozerg.java8to11.java8method;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("joguk");
        names.add("taek");
        names.add("swam");
        names.add("ho");

        /**
         * Consumer: 파라미터를 받고 리턴X
         */
        names.forEach(s -> System.out.println("s = " + s));

        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("============");
        while (stringSpliterator.tryAdvance(System.out::println));

        /**
         * Stream
         */
        long count = names.stream().map(s -> s.toUpperCase())
                .filter(s -> s.startsWith("J"))
                .count();

        System.out.println("count = " + count);

        /**
         * removeIf
         */
        names.removeIf(s -> s.startsWith("t"));
        names.forEach(System.out::println);

        /**
         * Comparator
         */
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

        Comparator<String> compareToIgcase = String::compareToIgnoreCase;
        names.sort(compareToIgcase.reversed());
    }
}
