package lesson.lesson9_19122018.p1_clone_with_override;

public class OwnerClass implements Cloneable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
