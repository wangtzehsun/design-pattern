package com.example.pattern.fundimentals.inheritance.practice01;
/*
basic inheritance to let sub class reuse super class method
*/
public class Main {

    public static void main(String[] args) {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        System.out.println(advanceCalculator.add(3, 7));
        System.out.println(advanceCalculator.subtract(18, 3));
        System.out.println(advanceCalculator.multiply(5, 6));
        System.out.println(advanceCalculator.divide(18, 6));
    }

}
