package com.example.pattern.strategy.exercise01;

import lombok.Data;

@Data
public class Dog extends Animal{

    public Dog() {
        super();
        flyingType = new CantFly();
    }

}
