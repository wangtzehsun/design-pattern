package com.example.pattern.factory.exercise01;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){
        if(newShipType.equalsIgnoreCase("U")){
            return new UFOEnemyShip();
        }else if(newShipType.equalsIgnoreCase("R")){
            return new RocketEnemyShip();
        }else if(newShipType.equalsIgnoreCase("B")){
            return new BigUFOEnemyShip();
        }
        throw new RuntimeException("No such kind of ship");
    }

}
