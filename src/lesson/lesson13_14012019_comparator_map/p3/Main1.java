package lesson.lesson13_14012019_comparator_map.p3;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        SoftDrink cola = new SoftDrink("cola", "black");
        SoftDrink sprite = new SoftDrink("sprite", "white");
        SoftDrink fanta = new SoftDrink("fanta", "orange");

        HardDrink vodka = new HardDrink("vodka", 40);
        HardDrink rum = new HardDrink("rum", 56);
        HardDrink wine = new HardDrink("wine", 12);

        List<HardDrink> list1 = new ArrayList<>();
        List<HardDrink> list2 = new ArrayList<>();

        list1.add(vodka);
        list2.add(rum);

        Map<SoftDrink, List<HardDrink>> map1 = new HashMap<>();

        map1.put(cola, list1);
        map1.put(sprite, list2);

        Set<SoftDrink> keySet = map1.keySet();

        Iterator<SoftDrink> it1 = keySet.iterator();
        while (it1.hasNext()) {
            Iterator<HardDrink> ittt = map1.get(it1.next()).iterator();
            while (ittt.hasNext()) {
                System.out.println(ittt.next());
            }
        }
    }
}
