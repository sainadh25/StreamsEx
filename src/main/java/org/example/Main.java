package org.example;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /* #1
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Sainadh...!!!!";
            }
        };

        Stream<String> stringStream = Stream.generate(supplier);

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        stringStream.forEach(consumer);*/

        /* #2
        Supplier<String> supplier = () -> "Sainadh...!!";

        Consumer<String> consmer = s -> System.out.println(s);

        Stream<String> integerStream = Stream.generate(supplier);

        integerStream.forEach(consmer);*/

        Stream.generate(() -> "Sainadh...!!").forEach(s -> System.out.println(s));

    }
}