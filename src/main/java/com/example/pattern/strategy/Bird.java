package com.example.pattern.strategy;

public class Bird extends Animal{

    public Bird() {
        flyingType = new ItFlys();
    }
}
