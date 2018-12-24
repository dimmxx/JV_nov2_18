package lesson.lesson10_24122018.p1_exception.p4;

public class DemoExc {

    public static void main(String[] args) {



        try{
            new Dog().getInfo();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }


    }


}
