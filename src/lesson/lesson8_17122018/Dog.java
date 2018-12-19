package lesson.lesson8_17122018;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.IntStream;

public class Dog extends Object {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object){
       if(!getClass().getName().equals(object.getClass().getName())) return false;
        Dog dog = (Dog) object;


        if (age == dog.age && name.equals(dog.name)) return true;

        return false;
    }




}
