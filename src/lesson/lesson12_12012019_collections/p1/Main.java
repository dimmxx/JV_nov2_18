package lesson.lesson12_12012019_collections.p1;

import lesson.lesson8_17122018.Dog;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        Dog dog = new Dog("John", 10);

        al.add(dog);
        al.add(new String ("Hello"));
        al.add(new Integer(4));

        System.out.println(al);

    }


}
