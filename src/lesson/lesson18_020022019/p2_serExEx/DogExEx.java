package lesson.lesson18_020022019.p2_serExEx;

import java.io.*;

public class DogExEx extends AnimalExEX implements Externalizable {


    public boolean blochable = true;
    private OwnerExEx owner;


    public DogExEx(){

    }

    public DogExEx(String name, int age){
        super(name, age);
    }

    public boolean isBlochable() {
        return blochable;
    }

    public void setBlochable(boolean blochable) {
        this.blochable = blochable;
    }

    public OwnerExEx getOwner() {
        return owner;
    }

    public void setOwner(OwnerExEx owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "DogExEx{" +
                "blochable=" + blochable +
                ", owner=" + owner + super.toString() +
                '}';
    }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getName());
        out.writeObject(getAge());
        out.writeBoolean(blochable);

        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setName((String)in.readObject());
        setAge(in.readInt());
        blochable = in.readBoolean();

        }
    }
