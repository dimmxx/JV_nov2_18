package lesson.lesson16_26012019_jdbc_xstream_sqlite_prs.xstream;

import java.io.FileNotFoundException;

public class MainDog {

    public static void main(String[] args) throws FileNotFoundException {

        Owner owner = new Owner("Alex");
        Dog dog = new Dog("Sharik", 10, owner);


//        XStream xs = new XStream(new StaxDriver());
//        xs.toXML(dog, new FileOutputStream("mate.xml"));
//
//        XStream xs1 = new XStream(new DomDriver());
//        Dog dog1  = new Dog();
//        xs1.fromXML(new FileInputStream("mate.xml"), dog1);
//        System.out.println(dog1.toString());


        DogController.writeXML("matte.xml", dog);

        System.out.println(DogController.readXML("matte.xml").toString());







    }





}
