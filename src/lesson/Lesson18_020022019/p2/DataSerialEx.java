package lesson.Lesson18_020022019.p2;

import java.io.*;

public class DataSerialEx {


    public static void main(String[] args) throws IOException {

//        DogEx dog = new DogEx("Susleg", 5);
//        OwnerD owner = new OwnerD();
//        owner.setName("Max");
//        dog.setOwner(owner);
//
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(baos);
//        oos.writeObject(dog);
//
//        owner.setName("Alex");
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bais);
//
//        DogEx clonedog = null;
//        try {
//            clonedog = (DogEx) ois.readObject();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(clonedog);


        DogEx dog = new DogEx("Susleg", 5);
        OwnerD owner = new OwnerD();
        owner.setName("Max");
        dog.setOwner(owner);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dog);

        owner.setName("Alex");
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        DogEx clonedog = null;
        try {
            clonedog = (DogEx) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clonedog);


    }


}
