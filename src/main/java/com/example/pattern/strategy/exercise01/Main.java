package com.example.pattern.strategy.exercise01;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());
        dog.setFlyingAbility(new ItFlys());
        System.out.println(dog.tryToFly());
    }

}
