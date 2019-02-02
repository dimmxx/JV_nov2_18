package lesson.Lesson18_020022019;

import java.io.*;

public class DataS {

    public static void main(String[] args) {
        Dog dog = new Dog("Susleg", 5);

//        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("dog.bin"))){
//            dos.writeUTF(dog.getName());
//            dos.writeInt(dog.getAge());
//            System.out.println("Stream OK");
//
//        }catch (IOException e){
//            System.out.println("Error");
//
//        }


        try(DataInputStream dis = new DataInputStream(new FileInputStream("dog.bin"))){
            Dog dog1 = new Dog();
            dog1.setName(dis.readUTF());
            dog1.setAge(dis.readInt());

            System.out.println(dog1.toString());

        }catch (IOException e){
            System.out.println("Error");

        }



    }









}
