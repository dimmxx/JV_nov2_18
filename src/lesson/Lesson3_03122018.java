package lesson;

import java.util.Arrays;
import java.util.Date;
import java.util.SplittableRandom;

public class Lesson3_03122018 {

    public static void main(String[] args) {

        //tern(100);
        //countTime();
        // countDigit(12345);
        //arrCopy();

        line();
    }

    public static void tern(int t) {
        System.out.println((t >= 100 ? "Steam" : (t > 0 ? "Water" : "Ice")));
    }


    public static void countTime() {

        for (int i = 0; i < 100; i++) {

            long startTime = new Date().getTime();

            int[] arrInt = new int[10];
            byte[] arrByte = new byte[10];
            short[] arrShort = new short[10];

            int counter = 0;
            int counterI = 0;
            int counterB = 0;
            int counterS = 0;

            do {
                int rnd = (int) (Math.random() * Integer.MAX_VALUE);

                if (counterB < 10 && rnd <= Byte.MAX_VALUE) {
                    arrByte[counterB++] = (byte) rnd;
                } else if (counterS < 10 && rnd <= Short.MAX_VALUE) {
                    arrShort[counterS++] = (short) rnd;
                }

                if (counterI < 10) {
                    arrInt[counterI++] = rnd;
                }
                counter++;
            }
            while ((counterB + counterI + counterS) < 30);
            long endTime = new Date().getTime();
            System.out.println(counter);
            System.out.println(endTime - startTime);
        }
    }

    public static void countDigit(int n) {
        int counter = 0;

        do {
            System.out.println(n % 10);
            n /= 10;
            counter++;
        } while (n != 0);

        System.out.println(counter);
    }



    public static void arrCopy(){

        int[] arr1 = new int[9];
        int[] arr2 = {5, 5, 5, 5, 5};

        System.arraycopy(arr2, 0, arr1, (arr1.length/2 - arr2.length/2), arr2.length);

        System.out.println(Arrays.toString(arr1));

    }

    public static void line(){

        String address = "ftp://ukr.net/news/sports.html";

        String protocol = address.substring(0, address.indexOf(":"));

        String domain = address.substring(protocol.length() + 3);
        domain = domain.substring(0, domain.indexOf("/"));
        String path = address.substring(protocol.length() + 3 + domain.length());

        System.out.println(address);
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);









    }








}


