package lesson.lesson8_17122018;

public class DemoParent {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();
        System.out.println(parent.name);
        System.out.println(child.name);

        //Parent parent = new Parent();
        Child child1 = new Child();
        Parent parent1 = child1;
        System.out.println(parent1.name);
        System.out.println(child1.name);




    }
}
