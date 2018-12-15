package lesson.lesson7_15122018;

public class CarClass {

    protected String mark;
    protected String model;

    public CarClass(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public void getInfo(){
        System.out.print("Mark: " + mark + " Model: " + model);
    }

}
