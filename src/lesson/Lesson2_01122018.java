package lesson;

import java.util.Scanner;

public class Lesson2_01122018 {

    public static void main(String[] args) {

        //int[] arr1 = {2, 3, 3, 3, 4, 5, 5, 6, 6,11, 10, 11, 11, 12, 13, 14, 18, 24, 27, 30, 30, 30, 31, 33, 33, 33, 34, 34, 35, 37, 37, 38, 38, 39, 39, 40, 41, 41, 42, 42, 43, 46, 47, 48, 49, 50, 52, 52, 54, 55, 55, 55, 56, 56, 56, 57, 58, 59, 59, 61, 62, 63, 64, 65, 69, 69, 69, 70, 70, 70, 71, 71, 71, 73, 75, 77, 78, 79, 82, 82, 83, 84, 85, 85, 87, 88, 88, 91, 92, 93, 94, 95, 95, 96, 96, 97, 97, 98, 98};
        //System.out.println(Arrays.toString(bubbleSortE(arr1)));

        //discount(400);

        //timer(10);

        scan();


    }

    public static int[] generate(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int[] bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
            for (int k = 0; k < array.length - 1 - i; k++) {
                count++;
                int temp = array[k];
                if (array[k] > array[k + 1]) {
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        System.out.println(count);
        return array;
    }

    public static int[] bubbleSortE(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
            boolean sorted = true;
            for (int k = 0; k < array.length - 1 - i; k++) {
                count++;
                int temp = array[k];
                if (array[k] > array[k + 1]) {
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        System.out.println(count);
        return array;
    }


    public static void discount(int n) {
        int discount = 0;
        if (n >= 300 && n < 400) discount = 3;
        if (n >= 400) discount = 5;
        int sum = n - (n * discount / 100);

        System.out.println("Your discount is " + discount + "%, to pay " + sum + "$");
    }

    public static void timer(int time) {
        for (int i = time; i >= 0; i--) {
            System.out.print("\r" + i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void scan () {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number: ");

        boolean ok = true;

        while (ok) {

            if (in.hasNextInt()) {
                int user = in.nextInt();
                break;
            }else{
                System.out.println("Error");
                 in.next();
            }
        }
    }
}
