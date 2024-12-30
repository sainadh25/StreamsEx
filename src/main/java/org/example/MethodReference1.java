package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReference1 {

    public static void main(String[] args) {


        // Using Anonymous function

        IntSum intSum = new IntSum() {
            @Override
            public int sum(int val1, int val2) {
                return val1 + val2;
            }
        };

        int sum = intSum.sum(1, 2);
        System.out.println("traditional way " + sum);

        //Using Lambdas

        IntSum intSum1 = ((val1, val2) -> val1 + val2);
        System.out.println("Using lambdas " + intSum1.sum(2,3));

        //Using Method Reference

        IntSum intSum2 = Integer::sum;
        System.out.println("Using Method ref " + intSum2.sum(4,5));


        //Referring list
        List<Integer> list = Arrays.asList(1, 9, 7, 0, 2, 5, 3);
        IntList intList = Collections::sort;
        intList.sorted(list);
        System.out.println("Using Method ref " + list);

    }
}
