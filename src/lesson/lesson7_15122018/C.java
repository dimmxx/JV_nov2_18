package lesson.lesson7_15122018;

public class C extends B{

        String name = "I am class C";

    C(){
        getInfo();
        System.out.println("construct C");
    }


    @Override
    void getInfo(){
        System.out.println(name);
    }




}
