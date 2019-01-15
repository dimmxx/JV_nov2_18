package homework.homework13;

public class DogClass {

    private String name;
    private int age;
    private String color;


    public DogClass(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "DogClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
