package com.example.pattern.factory.exercise01;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        System.out.println("What type of ship? (U/R/B)");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            try {
                theEnemy = factory.makeEnemyShip(scan.next());
                if(theEnemy != null){
                    doStuff(theEnemy);
                }
            } catch (Exception e) {
                System.out.println("There is no such type of ship please try again");
            }
        }

    }

    public static void doStuff(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

}
