package org.example;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Third {
    public static void main(String[] args) {

        // Print Integers that are > 5 from ArrayList

        /*Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> integerStream = Arrays.stream(arr);
        Stream<Integer> filteredIntegerStream = integerStream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        });
        filteredIntegerStream.forEach(s -> System.out.println(s));*/

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).filter(i -> i > 5).forEach(s -> System.out.println(s));

    }
}
