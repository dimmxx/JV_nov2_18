package homework.homework16;

public class Circle extends ShapeClass {

    private String name = "Circle";
    private double radius;
    private double area = Math.pow(radius, 2) * Math.PI;
    private double circumference = radius * 2 * Math.PI;

    public Circle(int side, String color){
        super(side, color);
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        super.printFigure();
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area);
        System.out.println("Circle сircumference: " + circumference);
    }


}
