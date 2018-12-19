package lesson.lesson9_19122018.p1;

import lesson.lesson9_19122018.Patch;

public class DemoPatch {

    public static void main(String[] args) throws CloneNotSupportedException {

       DogClass dog = new DogClass(10, "Tuzik");


       DogClass dog1 =  (DogClass) dog.clone();


        System.out.println(dog1.printString());

        System.out.println(dog.printString());
        System.out.println(dog1.printString());

        dog1.owner.setName("Dima");

         System.out.println(dog.printString());
        System.out.println(dog1.printString());



//// клонирование двух видов shallow and deep
//        поверхностное не учитывает связи между обьектами

//
//
//

    }


}
