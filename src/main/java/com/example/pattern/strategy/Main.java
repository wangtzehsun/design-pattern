package com.example.pattern.strategy;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());
    }

}
