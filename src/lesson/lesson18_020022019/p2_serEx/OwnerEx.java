package lesson.lesson18_020022019.p2_serEx;

import java.io.Serializable;

public class OwnerEx implements Serializable {

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
