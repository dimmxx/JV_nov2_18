package lesson.lesson6_12122018;

public class DogClass {

    private String name;
    private int age;
    //private String owner;
    private OwnerClass owner;


    public DogClass(){
    }

    public String getOwner() {
        return owner.getOwnerName();
    }

    public void setOwner(OwnerClass owner) {
        this.owner = owner;
    }

    public DogClass(String name, int age, OwnerClass owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }


    public DogClass(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void getInfo(){
        System.out.println(name + " " + age + " " + owner.getOwnerName());
    }



}
