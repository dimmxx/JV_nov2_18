package lesson.lesson16_26012019_jdbc.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StaxMain {

    public static void main(String[] args) throws FileNotFoundException {

//    XStream xs = new XStream(new StaxDriver());
//        Mate mate = new Mate();
//        mate.setId(1);
//        mate.setName("Dima");
//        mate.setAge(15);
//
//        xs.toXML(mate, new FileOutputStream("mate.xml"));


        XStream xs = new XStream(new DomDriver());
        Mate mate = new Mate();
        xs.fromXML(new FileInputStream("mate.xml"), mate);
        System.out.println(mate);


    }




}
