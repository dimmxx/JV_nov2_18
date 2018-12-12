package lesson.lesson6_12122018;

public class DemoDog {

    public static void main(String[] args) {

//        DogClass dog = new DogClass();
//        dog.setAge(10);
//        dog.setName("Sharik");
//        dog.getInfo();
//
//        DogClass dog1 = new DogClass("Tuzik", 5);
//        dog1.getInfo();
//
//        dog1.setName("Bulka");
//        dog1.setAge(4);
//        dog1.getInfo();
//
//
//        OwnerClass owner = new OwnerClass();
//
//        owner.setOwnerName("Vasiliy");
//
//        DogClass dog3 = new DogClass();
//        dog3.setAge(5);
//        dog3.setName("Kazbek");
//        dog3.setOwner(owner.getOwnerName());
//
//        dog3.getInfo();


        OwnerClass owner1 = new OwnerClass();
        DogClass dog4 = new DogClass();
        owner1.setOwnerName("Peter1");
        dog4.setOwner(owner1); //???????????????????????????????????????????????????????
        //System.out.println(owner1.getOwnerName());
        dog4.getInfo();


    }


}
