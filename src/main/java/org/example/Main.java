package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(4);
        c.multiply(3);
        c.division(2);
        System.out.println("Result: " + c.getResult());
        Calculator2 c2 = new Calculator2(4);
        c2.negativ();
        System.out.println("Result: " + c2.getResult());
    }
}