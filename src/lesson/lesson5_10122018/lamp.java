package lesson.lesson5_10122018;

public class lamp {

    int brightness = 0;
    boolean state = false;



    void lampInfo(){
        brightness == 100 ?


        System.out.println("The lamp is " + (state ? "ON" : "OFF") + ". Brightness: " + brightness);


    }

    void lampOn(){

        brightness = 100;
    }


    void lampOff(){

        brightness = 0;
    }




}
