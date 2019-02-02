package lesson.Lesson18_020022019.p2;

import java.io.*;

public class DogEx extends Animal implements Externalizable {





    public boolean blochable = true;
    private OwnerD owner;


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

    public OwnerD getOwner() {
        return owner;
    }

    public void setOwner(OwnerD owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "DogEx{" +
                "blochable=" + blochable +
                ", owner=" + owner + super.toString() +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getName());
        out.writeInt(getAge());
        out.writeBoolean(blochable);

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        //setName((()));

    }
}
