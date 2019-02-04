package lesson.lesson18_020022019.p4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainByteArray {

    public static void main(String[] args) {


        Owner owner = new Owner("Peter");
        Cat cat = new Cat("Murzik", 2, owner);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(cat);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(baos.toString());
        System.out.println(baos.size());


        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());




    }




}
