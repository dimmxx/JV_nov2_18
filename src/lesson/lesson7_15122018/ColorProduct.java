package lesson.lesson7_15122018;

public class ColorProduct extends ProductClass {

    private String color;

    public ColorProduct(String nameGood, int price, String color){
        super(nameGood, price);
        this.color = color;

    }



    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Color " + color);
    }





}
