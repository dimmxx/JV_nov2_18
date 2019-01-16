package lesson.lesson13_14012019_comparator_map.p2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        ((LinkedList<Integer>) queue).pop();
        System.out.println(queue);








    }




}
