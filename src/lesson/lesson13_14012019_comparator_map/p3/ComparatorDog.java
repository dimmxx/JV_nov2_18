package lesson.lesson13_14012019_comparator_map.p3;

import lesson.lesson8_17122018.Dog;

import java.util.Comparator;

public class ComparatorDog implements Comparator <Dog>{


    @Override
    public int compare(Dog o, Dog t1) {
        return o.getAge() > t1.getAge()? 1: -1;
    }


}
