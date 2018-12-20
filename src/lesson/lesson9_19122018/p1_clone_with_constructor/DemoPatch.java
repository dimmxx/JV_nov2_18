package lesson.lesson9_19122018.p1_clone_with_constructor;

public class DemoPatch {

    public static void main(String[] args) {

        DogClass dog = new DogClass(10, "Tuzik");
        OwnerClass owner = new OwnerClass("Peter");
        dog.setOwner(owner);

        DogClass dog1 = new DogClass(dog);

        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog.printString());
        System.out.println(dog1.printString());

        dog1.setOwnerName("Dima");

        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog.printString());
        System.out.println(dog1.printString());



    }


}
