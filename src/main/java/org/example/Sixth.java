package org.example;

import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Sixth {

    public static void main(String[] args) {
        //Sorting
        /*Stream.of(4,2,5,6,9,8)
                .sorted()
                .forEach(s-> System.out.println(s));*/

        // Reverse sort order
        /*Stream.of(4,2,5,6,9,8)
                .filter(n-> n>4)
                .sorted(Comparator.reverseOrder())
                .forEach(s-> System.out.println(s));*/

        //iterate is an infinite loop, limit is used to short-circuit the pipeline
        Stream.iterate(1, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i) {i++;return i * i;
            }
        }).limit(10)
                .forEach(s-> System.out.println(s));

    }
}
