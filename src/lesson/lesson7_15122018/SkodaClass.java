package lesson.lesson7_15122018;

public class SkodaClass extends CarClass {


    String player = "Pioneer";


    SkodaClass(String mark, String model){
        super(mark, model);

    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(player);
    }



}
