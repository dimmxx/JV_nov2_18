package lesson.lesson13_14012019.p1.p3;

import lesson.lesson8_17122018.Dog;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparatorDog implements Comparator <Dog>{


    @Override
    public int compare(Dog o, Dog t1) {
        return o.getAge() > t1.getAge()? 1: -1;
    }


}
