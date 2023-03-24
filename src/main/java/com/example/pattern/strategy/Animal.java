package com.example.pattern.strategy;

import lombok.Data;

public class Animal {

    public String name;
    public int age;

    public Flys flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }

}
