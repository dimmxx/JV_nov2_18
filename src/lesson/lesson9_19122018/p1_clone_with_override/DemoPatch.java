package lesson.lesson9_19122018.p1_clone_with_override;

public class DemoPatch {

    public static void main(String[] args) throws CloneNotSupportedException {

       DogClass dog = new DogClass(10, "Tuzik");
       OwnerClass owner = new OwnerClass();
       owner.setName("John owner");
       dog.setOwner(owner);

       System.out.println(dog.printString());

       DogClass dog1 = (DogClass) dog.clone();

        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog.printString());
        System.out.println(dog1.printString());

        dog1.owner.setName("Peter dog1 owner");

        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog.printString());
        System.out.println(dog1.printString());








//// клонирование двух видов shallow and deep
//        поверхностное не учитывает связи между обьектами
//
//
//







    }


}
