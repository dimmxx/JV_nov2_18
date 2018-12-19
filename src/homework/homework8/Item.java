package homework.homework8;

public class Item {

    private String name;
    private int strike;
    private int defence;

    public Item(String name, int strike, int defence){
        this.name = name;
        this.strike = strike;
        this.defence = defence;
    }


    @Override
    public String toString() {
        return " " + name  +
                ", strike - " + strike +
                ", defence - " + defence;
    }
}
