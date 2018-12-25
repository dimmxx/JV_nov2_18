package lesson.lesson10_24122018.p7_interface;

public interface Voice {

    int age = 10;
    void getVoice();

    default void someMethod(){
        System.out.println("SomeMethod");
    }



}
