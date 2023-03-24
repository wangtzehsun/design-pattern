package com.example.pattern.fundimentals.inheritance.practice01;
/*
basic inheritance to let sub class reuse super class method
*/
public class Main {

    public static void main(String[] args) {
//        AdvanceCalculator calculator = new AdvanceCalculator();
        SuperAdvanceCalculator calculator = new SuperAdvanceCalculator();
        System.out.println(calculator.add(3, 7));
        System.out.println(calculator.subtract(18, 3));
        System.out.println(calculator.multiply(5, 6));
        System.out.println(calculator.divide(18, 6));
        System.out.println(calculator.power(2,4));
    }

}
