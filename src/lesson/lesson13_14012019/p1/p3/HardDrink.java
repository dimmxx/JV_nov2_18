package lesson.lesson13_14012019.p1.p3;

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
