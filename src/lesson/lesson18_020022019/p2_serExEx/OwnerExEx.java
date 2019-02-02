package lesson.lesson18_020022019.p2_serExEx;

import java.io.Serializable;

public class OwnerExEx {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "OwnerExEx{" +
                "name='" + name + '\'' +
                '}';
    }
}
