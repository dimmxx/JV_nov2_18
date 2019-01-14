package lesson.lesson13_14012019.p1.p3;

import java.util.Objects;

public class SoftDrink {

    private String name;
    private String color;

    public SoftDrink(String name, String color) {
        this.name = name;
        this.color = color;
    }


    @Override
    public String toString() {
        return name + " " + color;
    }


}
