package lesson.lesson18_020022019.p2;

import java.io.Serializable;

public class DogDp2 implements Serializable {

    private String name;
    private int age;
    private OwnerDp2 owner;

    public DogDp2(){

    }


    public DogDp2(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public OwnerDp2 getOwner() {
        return owner;
    }

    public void setOwner(OwnerDp2 owner) {
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
        return "DogDp2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}
