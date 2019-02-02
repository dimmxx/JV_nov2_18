package lesson.lesson18_020022019.p2_serEx;

import java.io.*;

public class DogEx extends Animal implements Serializable {


    public boolean blochable = true;
    private OwnerEx owner;


    public DogEx(){

    }

    public DogEx (String name, int age){
        super(name, age);
    }

    public boolean isBlochable() {
        return blochable;
    }

    public void setBlochable(boolean blochable) {
        this.blochable = blochable;
    }

    public OwnerEx getOwner() {
        return owner;
    }

    public void setOwner(OwnerEx owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "DogExEx{" +
                "blochable=" + blochable +
                ", owner=" + owner + super.toString() +
                '}';
    }


}
