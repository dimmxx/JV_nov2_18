package homework.homework13;

import java.util.Objects;

public class DogClass {

    private String name;
    private int age;
    private String color;


    public DogClass(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "DogClass {" + "name = " + name  + ", age = "
                + age + ", color = " + color + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DogClass)) return false;
        DogClass dogClass = (DogClass) o;
        return getAge() == dogClass.getAge() &&
                getName() == dogClass.getName() &&
                getColor() == dogClass.color;
    }



}
