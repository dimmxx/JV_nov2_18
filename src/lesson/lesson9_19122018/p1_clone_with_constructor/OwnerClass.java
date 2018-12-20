package lesson.lesson9_19122018.p1_clone_with_constructor;

public class OwnerClass implements Cloneable {

    private String name;


    public OwnerClass(String name) {
        this.name = name;
    }

    public OwnerClass(OwnerClass owner) {
        this.name = owner.getName();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
