package lesson.lesson13_14012019_comparator_map.p3;

public class HardDrink {

    private String name;
    private int degree;


    public HardDrink(String name, int degree) {
        this.name = name;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return name + " " + degree;
    }


}
