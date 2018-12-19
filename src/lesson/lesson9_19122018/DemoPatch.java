package lesson.lesson9_19122018;

public class DemoPatch {

    public static void main(String[] args) throws CloneNotSupportedException {

        Patch patch = new Patch();

        Object ob = patch;



       DogClass dog = new DogClass(10, "Tuzik");

 //      DogClass dog1 = (DogClass) dog.clone();

//        System.out.println(dog);
//        System.out.println(dog1);
//
//        System.out.println(dog.printString());
//        System.out.println(dog1.printString());


        OwnerClass owner = new OwnerClass();
        owner.name = "Peter";


        dog.setOwner(owner);

        System.out.println(dog.printString());

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
