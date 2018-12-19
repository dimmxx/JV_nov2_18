package lesson.lesson9_19122018;

public class DogClass implements Cloneable{

    private int age;
    String name;

    OwnerClass owner;


    public DogClass(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(OwnerClass owner) {
        this.owner = owner;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        OwnerClass ownerTemp = (OwnerClass) owner.clone();
        DogClass dogTemp = (DogClass) super.clone();
        dogTemp.setOwner(ownerTemp);
        return dogTemp;



    }







    public String printString() {
        return "DogClass{" +
                "age=" + age +
                ", name='" + name + '\'' + " " + owner.name +
                '}' ;
    }
}
