package lesson.lesson9_19122018.p1_clone_with_constructor;

public class DogClass implements Cloneable{

    private int age;
    private String name;

    private OwnerClass owner;

    public DogClass(DogClass dog) {
        this.age = dog.age;
        this.name = dog.name;
        owner = new OwnerClass(dog.owner);
    }




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

    public void setOwnerName(String name){
        owner.setName(name);
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
                ", name='" + name + '\'' + " " + owner.getName() +
                '}' ;
    }
}
