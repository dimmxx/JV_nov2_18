package lesson.lesson18_020022019.p2_serFile;

import java.io.*;

public class DataSerialFile {

    public static void main(String[] args) throws IOException {

        DogD dog = new DogD("Susleg", 5);
        OwnerD owner = new OwnerD();
        owner.setName("Max");
        dog.setOwner(owner);

        FileOutputStream fos = new FileOutputStream(dog.getClass().getName() + ".ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);

        owner.setName("Alex");

        FileInputStream fis = new FileInputStream(dog.getClass().getName() + ".ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogD clonedog = null;
        try {
            clonedog = (DogD) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clonedog);

    }




}
