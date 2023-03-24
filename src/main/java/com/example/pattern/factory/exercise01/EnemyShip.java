package com.example.pattern.factory.exercise01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EnemyShip {

    public String name;
    public double damageAmt;

    public void followHeroShip(){
        System.out.println(getName() + "is following the hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + "is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + "attacks and does" + getDamageAmt());
    }

}
