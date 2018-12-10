package lesson.lesson5_10122018;

public class Door {

    String color = "Red";
    String material = "Wood";
    boolean state = false;

    void doorClose(){
        state = false;

    }


    void doorOpen(){
        state = true;
    }



    void doorState(){
        System.out.println(color);
        System.out.println(material);
        if(state) System.out.println("OPEN");
        else System.out.println("CLOSED");
    }




}
