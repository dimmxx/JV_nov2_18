package lesson.Lesson18_020022019.p2;

import java.io.Serializable;

public class DogD implements Serializable {

    private String name;
    private int age;
    private OwnerD owner;

    public DogD(){

    }


    public DogD(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public OwnerD getOwner() {
        return owner;
    }

    public void setOwner(OwnerD owner) {
        this.owner = owner;
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
        return "DogD{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}
