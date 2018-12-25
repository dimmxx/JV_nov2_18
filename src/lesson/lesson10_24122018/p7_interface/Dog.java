package lesson.lesson10_24122018.p7_interface;



public class Dog extends Animal implements Voice{

    public Dog(String name) {
        super(name);
    }

    Owner owner = new Owner();

   // @Override
    public void getVoice() {
        System.out.println("Gav");
    }


}
