package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class InBuiltFI {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(3,2,1);
        Consumer<List<Integer>> sortList = Collections::sort;
        sortList.accept(integerList);
        System.out.println(integerList);

        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        Integer sumOfTwo = sum.apply(10, 20);
        System.out.println(sumOfTwo);

        BiPredicate<String, String > biPredicate = Objects::equals;
        boolean test = biPredicate.test("Sai", "Sai");
        System.out.println(test);

        Consumer<String> check = Objects::nonNull;
        check.accept(null);


        Function<Object, Integer> hash = Object::hashCode;
        Integer apply = hash.apply(new InBuiltFI());
        System.out.println(apply);

        Consumer<Object> hash1 = Object::hashCode;
        hash1.accept(new InBuiltFI());

        Consumer<String> print = System.out::print;
        print.accept("Sai");

    }
}