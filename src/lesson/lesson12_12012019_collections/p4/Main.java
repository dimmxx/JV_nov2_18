package lesson.lesson12_12012019_collections.p4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        //www.cs.usfca.edu/~galles/visualization/RedBlack.html

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

    }
}
