package lesson.lesson13_14012019.p1.p3;

import lesson.lesson8_17122018.Dog;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //TreeSet<Dog> setDog = new TreeSet<>(new ComparatorDog());
        //Set<Dog> setDog = new TreeSet<>(new ComparatorDog());

        Set<Dog> setDog = new TreeSet<>(new Comparator<Dog>(){
            @Override
            public int compare(Dog dog, Dog t1) {
                return dog.getAge() > t1.getAge() ? 1 : -1;
            }
        });

        Dog dog1 = new Dog("Kate", 122);
        Dog dog2 = new Dog("Peter", 10);
        Dog dog3 = new Dog("Joe", 12);

        setDog.add(dog1);
        setDog.add(dog2);
        setDog.add(dog3);

        System.out.println(setDog);

        List<Dog> dogList = new ArrayList<>(setDog);

        System.out.println(dogList);

        dogList.sort(new ComparatorDogReverse()); // сделать анонимным классом

        System.out.println(dogList);

        Iterator<Dog> it = dogList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Map<String, String> map = new HashMap<>();
        map.put("name", "Yaroslav");
        map.put("address", "Bucha");

        System.out.println(map.size());

        SoftDrink cola = new SoftDrink("cola", "black");
        SoftDrink sprite = new SoftDrink("sprite", "white");
        SoftDrink fanta = new SoftDrink("sprite", "white"); // одинаковые поля!!!!!!!!!!!!

        HardDrink vodka = new HardDrink("vodka", 40);
        HardDrink rum = new HardDrink("rum", 56);
        HardDrink wine = new HardDrink("wine", 12);

        Map<SoftDrink, HardDrink> map1 = new HashMap<>();

        map1.put(cola, vodka);
        map1.put(sprite, rum);
        map1.put(fanta, wine);

        System.out.println(map1);

        Set<SoftDrink> keySet = map1.keySet();

        Iterator<SoftDrink> it1 = keySet.iterator();
        while (it1.hasNext()){
            System.out.println(map1.get(it1.next()));
        }





    }

}
