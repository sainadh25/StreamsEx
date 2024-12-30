package org.example;

import java.util.stream.Stream;

public class Seventh {
    public static void main(String[] args) {
        // takeWhile v/s filter

        Stream.of("Sai", "Ganesh", "Jo", "Vineeth","Rj")
                .filter(n->n.length()>2)
                .forEach(System.out::println);
        /*o/p:
        Sai
        Ganesh
        Vineeth*/

        Stream.of("Sai", "Ganesh", "Jo", "Vineeth","Rj")
                .takeWhile(n->n.length()>2)
                .forEach(System.out::println);

        /*o/p:
        Sai
        Ganesh*/

        //Ex-2:

        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(n->{
                    System.out.println(n);
                    return n<5;
                })
                .forEach(System.out::println);

        /*outputs:
        takeWhile:
        1
        1
        2
        2
        3
        3
        4
        4
        5
        filter:
        1
        1
        2
        2
        3
        3
        4
        4
        5
        6
        7
        8
        9
        10*/





    }
}
