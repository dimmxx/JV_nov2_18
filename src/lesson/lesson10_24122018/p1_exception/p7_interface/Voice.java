package lesson.lesson10_24122018.p1_exception.p7_interface;

public interface Voice {

    int age = 10;
    void getVoice();

    default void someMethod(){
        System.out.println("SomeMethod");
    }



}
