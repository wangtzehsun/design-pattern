package com.example.pattern.strategy.exercise01;

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
