package lesson.lesson16_26012019_jdbc.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainDog {

    public static void main(String[] args) throws FileNotFoundException {

        Owner owner = new Owner("Alex");
        Dog dog = new Dog("Sharik", 10, owner);


        XStream xs = new XStream(new StaxDriver());
        xs.toXML(dog, new FileOutputStream("mate.xml"));


        XStream xs1 = new XStream(new DomDriver());
        Dog dog1  = new Dog();
        xs.fromXML(new FileInputStream("mate.xml"), dog1);
        System.out.println(dog1.toString());







    }





}
