package lesson.lesson18_020022019.p2;

import java.io.*;

public class DataSerial {

    public static void main(String[] args) throws IOException {

        DogDp2 dog = new DogDp2("Susleg", 5);
        OwnerDp2 owner = new OwnerDp2();

        owner.setName("Max");
        dog.setOwner(owner);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dog);

        owner.setName("Alex");

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        DogDp2 clonedog = null;
        try {
            clonedog = (DogDp2) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clonedog);


        System.out.println(dog);
        System.out.println(clonedog);






    }









}
