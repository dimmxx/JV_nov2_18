package lesson.lesson9_19122018.p4.p5;

public class Guitar {

    private String sound;

    public Guitar(String sound, String mode) {
        this.sound = sound;
        new Combo(mode);
        System.out.println(sound);
    }

    class Combo{


        Combo(String mode){
            switch (mode){
                case "normal":
                    sound = sound.toLowerCase();
                    break;

                case "overload":
                    sound = sound.toUpperCase();
                    break;
            }
        }




    }







}
