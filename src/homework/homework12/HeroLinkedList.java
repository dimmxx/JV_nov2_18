package homework.homework12;

import java.util.LinkedList;

public class HeroLinkedList extends LinkedList<Hero> {

    public void addAndSort(Hero hero, HeroLinkedList list){
        if (list.size() == 0){
            list.add(hero);
        }else{

            for (int i = 0; i <= list.size(); i++) {
                if (list.get(i).getIntel() >= hero.getIntel()) {
                    list.addFirst(hero);
                    break;
                } else if (list.get(i).getIntel() < hero.getIntel()) {
                    continue;
                }


            }


        }



    }




}
