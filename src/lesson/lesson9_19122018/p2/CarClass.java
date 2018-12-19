package lesson.lesson9_19122018.p2;

public class CarClass {

    static String mark;
    String model;

    static String color;

    public CarClass(String mark, String model, String color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public void getInfo(){
        System.out.print("\nMark: " + mark + " Model: " + model + " " + color);
    }


    public static void printStatic(){
        System.out.println(mark);

    }

    public void getSound(){
        System.out.println("Beep");

    }



}
