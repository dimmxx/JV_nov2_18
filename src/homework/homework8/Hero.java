package homework.homework8;

import java.util.Arrays;

public class Hero {

    private String name;
    private int health =100;

    private int accuracy;
    private int intel;
    private int strength;

    Item[] item = new Item[2];

    private int strike = intel/3 + accuracy/2 + strength;

    public Hero(String name, int health, int accuracy, int intel, int strength) {
        this.name = name;
        this.health = health;
        this.accuracy = accuracy;
        this.intel = intel;
        this.strength = strength;
    }

    private int ultimate(){
        return strike * 2;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", accuracy=" + accuracy +
                ", intel=" + intel +
                ", strength=" + strength +
                ", item=" + Arrays.toString(item) +
                ", strike=" + strike +
                '}';
    }


}
