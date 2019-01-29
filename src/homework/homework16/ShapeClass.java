package homework.homework16;
import java.util.Scanner;

public class ShapeClass {

    private String name;
    private String color;
    private double area;
    private double perimeter;
    private int side;

    public ShapeClass(int side, String color) {
        this.side = side;
        this.color = color;
    }



    public void printFigure() {
        System.out.println("Shape color: " + color);
    }


}
