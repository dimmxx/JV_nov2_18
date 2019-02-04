package lesson.lesson18_020022019.p4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Owner owner = new Owner("Peter");
        Cat cat = new Cat("Murzik", 2, owner);

//        ObjectOutputStream oos =
//                new ObjectOutputStream(new FileOutputStream("cat.dat"));
//        oos.writeObject(cat);
//        oos.flush();
//        oos.close();

        try (FileOutputStream fos = new FileOutputStream("cat1.dat")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(cat);
            }
        }
        owner.setOwnername("John");



        Cat catClone = null;
        try (FileInputStream fis = new FileInputStream("cat.dat")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                catClone = (Cat) ois.readObject();
            }
        }

        System.out.println(catClone);



    }



}
