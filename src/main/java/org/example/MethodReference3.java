package org.example;

public class MethodReference3 {
    public static void main(String[] args) {
        IntUpper2 intUpper2 = MethodReference3::convertTo;
        String toUpper = intUpper2.covertToUpper(new MethodReference3(), "Sai");
        System.out.println(toUpper);
    }
    String convertTo(String s) {
        return s.toUpperCase();
    }
}
