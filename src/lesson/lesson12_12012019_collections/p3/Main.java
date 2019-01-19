package lesson.lesson12_12012019_collections.p3;

import lesson.lesson8_17122018.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Dog> al = new LinkedList<>();

        ArrayList<Dog> al2 = new ArrayList();

        Dog dog = new Dog("John", 5);
        Dog dog2 = new Dog("Kate", 2);
        Dog dog3 = new Dog("Kate", 2);

        al.add(dog);
        al.add(dog2);
        al.add(new Dog("Peter", 3));
        al.add(dog3);

        al2.add(dog2);
        al2.add(new Dog("Peter", 5));

        al.addAll(al2);

        System.out.println(al);

        // удалить итератором дог возрастом 5
        Iterator<Dog> dogIterator = al.iterator();
        while (dogIterator.hasNext()){
            //Dog temp = dogIterator.next();
            if(dogIterator.next().getAge() == 5) dogIterator.remove();
        }
        System.out.println(al);
    }
}
