package lesson.lesson10_24122018.p7_interface;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract void getVoice();


}
