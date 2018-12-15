package lesson.lesson7_15122018;

public class B extends A{

     String name = "I am class B";

    B(){
        getInfo();
    }


    @Override
    void getInfo(){
        System.out.println(name);
    }




}
