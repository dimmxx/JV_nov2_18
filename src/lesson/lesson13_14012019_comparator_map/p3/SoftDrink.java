package lesson.lesson13_14012019_comparator_map.p3;

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
