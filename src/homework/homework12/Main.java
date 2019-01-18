package homework.homework12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Luna", 100, 20, 100);
        Hero hero2 = new Hero("Zeus", 120, 20, 40);
        Hero hero3 = new Hero("Appolo", 110, 20, 31);
        Hero hero4 = new Hero("Ares", 10, 20, 300);
        Hero hero5 = new Hero("Hector", 200, 20, 30);
        Hero hero6 = new Hero("Hermes", 300, 20, 3);
        Hero hero7 = new Hero("Poseidon", 150, 20, 0);
        Hero hero8 = new Hero("Adonis", 130, 20, 1);

        HeroLinkedList heroList = new HeroLinkedList();

        System.out.println("List size: " + heroList.size());

        heroList.addAndSort(hero1, heroList);
        heroList.addAndSort(hero2, heroList);
        heroList.addAndSort(hero8, heroList);
        heroList.addAndSort(hero5, heroList);












        Iterator<Hero> it = heroList.iterator();
        while (it.hasNext()){

            System.out.println(it.next());

        }




    }









}
