package lesson.lesson9_19122018.p1;

public class OwnerClass implements Cloneable {

    String name;





    public OwnerClass(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
