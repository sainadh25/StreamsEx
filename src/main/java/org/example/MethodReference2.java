package org.example;

public class MethodReference2 {

    public static void main(String[] args) {

        //MethodReference2
        MethodReference2 methodReference2 = new MethodReference2();
        IntUpper intUpper = methodReference2::convertTo; // or IntUpper intUpper = new MethodReference2()::convertTo
        String u = intUpper.covertToUpper("sai");
        System.out.println(u);


    }

    String convertTo(String s) {
        return s.toUpperCase();
    }

}
