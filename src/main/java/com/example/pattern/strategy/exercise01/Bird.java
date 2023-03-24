package com.example.pattern.strategy.exercise01;

public class Bird extends Animal{

    public Bird() {
        flyingType = new ItFlys();
    }
}
