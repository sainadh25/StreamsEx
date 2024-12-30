package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fourth {
    public static void main(String[] args) {

        // Print Integers that are > 5 in words from ArrayList

        Integer[] arr = {1,2,3,4,5,6,7};
        Stream<Integer> integerStream = Arrays.stream(arr);
        Stream<Integer> filterStream = integerStream.filter(n -> {System.out.println("from filter"); return n > 5;});
        Stream<String> mapStream = filterStream.map(number ->
                switch (number) {
                    case 6:
                        yield "six";
                    case 7:
                        yield "seven";
                    default:
                        throw new IllegalStateException("Unexpected value: " + number);
                });

        long count = mapStream.count();
        List<String> collect = mapStream.collect(Collectors.toList());
        mapStream.forEach(n-> System.out.println(n));

    }
}
