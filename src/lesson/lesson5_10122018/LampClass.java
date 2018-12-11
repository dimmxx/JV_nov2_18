package lesson.lesson5_10122018;

public class LampClass {

    int brightness = 0;
    boolean state = false;



    void lampInfo(){
        System.out.println("The lamp is " + (state ? "ON." : "OFF.") + " The brightness is " + brightness + ".");
    }


    void lampOn(){
        brightness = 100;
        state = true;
    }


    void lampOff(){
        brightness = 0;
        state = false;
    }

}
