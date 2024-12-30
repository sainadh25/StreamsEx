package org.example;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Second {

    public static void main(String[] args) {

        /* #1
        Stream<Integer> integerStream = Stream.of(1,2,3);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        integerStream.forEach(consumer);*/

        /* #2
        Consumer<Integer> consumer =  integer -> System.out.println(integer);
        Stream.of(1,2,3).forEach(consumer);*/

        Stream.of(1,2,3).forEach(integer -> System.out.println(integer));

    }
}
