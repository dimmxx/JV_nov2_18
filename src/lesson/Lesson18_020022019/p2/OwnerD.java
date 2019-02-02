package lesson.Lesson18_020022019.p2;

import java.io.Serializable;

public class OwnerD implements Serializable {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "OwnerD{" +
                "name='" + name + '\'' +
                '}';
    }
}
