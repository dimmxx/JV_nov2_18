package lesson.lesson12_12012019_collections.p5;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.print("RND: ");
        for (int i = 0; i < 10; i++) {
            Integer rnd = (int) (Math.random() * 100);
            System.out.print(rnd + " ");
            hs.add(rnd);
            lhs.add(rnd);
            ts.add(rnd);
        }

        System.out.println("\nhs " + hs);
        System.out.println("lhs " + lhs);
        System.out.println("ts " + ts);

        System.out.println("-----------------------");

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            if(it.next() % 2 == 0) it.remove();
        }

        System.out.println("\nhs " + hs);
        System.out.println("lhs " + lhs);
        System.out.println("ts " + ts);

        lhs.removeAll(ts);
        ts.retainAll(lhs);

        System.out.println("\nhs " + hs);
        System.out.println("lhs " + lhs);
        System.out.println("ts " + ts);

    }
}


