package lesson.lesson16_26012019_jdbc_xstream_sqlite_prs.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DogController {


    public static void writeXML(String filename, Dog dog) throws FileNotFoundException {
        XStream xs = new XStream(new StaxDriver());
        xs.toXML(dog, new FileOutputStream(filename));
    }

    public static Dog readXML(String filename) throws FileNotFoundException {
        XStream xs = new XStream(new DomDriver());
        Dog dog  = new Dog();
        xs.fromXML(new FileInputStream(filename), dog);
        return dog;
    }


//CREATE TABLE mate (id INT PRIMARY KEY AUTO_INCREMENT,
// name VARCHAR(30), area VARCHAR(30), perimeter VARCHAR(30), user VARCHAR(50));

    //DZ config - host db user psw

    //id name color area perim user



}
