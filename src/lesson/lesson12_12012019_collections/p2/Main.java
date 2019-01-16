package lesson.lesson12_12012019_collections.p2;

import lesson.lesson8_17122018.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Dog> al = new ArrayList();
        ArrayList<Dog> al2 = new ArrayList();


        Dog dog = new Dog("John", 10);
        Dog dog2 = new Dog("Kate", 2);
        Dog dog3 = new Dog("Kate", 2);

        al.add(dog);
        al.add(dog2);
        al.add(dog3);
        al.add(new Dog("Peter", 3));


        al2.add(dog2);
        al2.add(new Dog("Peter", 3));

        System.out.println(al);
        System.out.println(al2);

        //al.addAll(al2);

        System.out.println(al);

        int size = al.size();
        al.retainAll(al2);
        System.out.println(al);
        System.out.println(size - al.size());// колво совпавших элементов



        //System.out.println(al.get(1).equals(al.get(3)));

        System.out.println(al.contains(dog3));

        //remove







    }









}
