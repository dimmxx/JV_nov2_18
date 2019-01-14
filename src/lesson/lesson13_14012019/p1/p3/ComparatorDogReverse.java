package lesson.lesson13_14012019.p1.p3;

import lesson.lesson8_17122018.Dog;

import java.util.Comparator;

public class ComparatorDogReverse implements Comparator <Dog> {


    @Override
    public int compare(Dog dog, Dog t1) {
        return dog.getAge() < t1.getAge()? 1: -1;
    }
}
