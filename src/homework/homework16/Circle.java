package homework.homework16;

public class Circle extends ShapeClass {

    private String name;
    private double area;
    private double perimeter;

    public Circle(int side) {
        super(side);
        name = "Circle";
        area = Math.pow(side, 2) * Math.PI;
        perimeter = side * 2 * Math.PI;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    @Override
    public boolean add() {
        DbWorkerItea2 worker = new DbWorkerItea2();
        worker.addShape(this);
        worker = null;
        return false;
    }
}



