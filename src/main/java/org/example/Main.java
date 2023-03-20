package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(4);
        c.multiply(3);
        c.division(2);
        System.out.println("Result: " + c.getResult());
    }
}