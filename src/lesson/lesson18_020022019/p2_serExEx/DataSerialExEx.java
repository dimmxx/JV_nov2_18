package lesson.lesson18_020022019.p2_serExEx;

import java.io.*;

public class DataSerialExEx {


    public static void main(String[] args) throws IOException {

        DogExEx dog = new DogExEx("Susleg", 5);
        OwnerExEx owner = new OwnerExEx();
        owner.setName("Max");
        dog.setOwner(owner);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        dog.writeExternal(oos);


        //oos.writeObject(dog);

        owner.setName("Alex");
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        DogExEx clonedog = null;
        try {
            //clonedog = (DogExEx) ois.readObject();
            clonedog.readExternal(ois);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clonedog);


    }

}
