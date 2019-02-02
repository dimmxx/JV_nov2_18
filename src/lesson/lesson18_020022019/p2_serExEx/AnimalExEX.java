package lesson.lesson18_020022019.p2_serExEx;

import java.io.Serializable;

public class AnimalExEX {

    private String name;
    private int age;

    public AnimalExEX(){

    }

    public AnimalExEX(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "AnimalExEX{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
