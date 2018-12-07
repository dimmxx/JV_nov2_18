package lesson;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Lesson4_05122018 {


    public static void main(String[] args) {

       // lottery(36, 6);

        //arrString();

        format();

    }

    public static void lottery(int num, int winNum){
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < winNum; k++){
            int rnd = (int)(Math.random()*(num - k));
            System.out.println("Index: " + rnd + "   Random: " + array[rnd]);
            int temp = array[rnd];
            array[rnd] = array[num - k -1];
            array[num - k - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void arrString(){
        String[][] db = new String[3][3];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < db.length; i++) {
            System.out.println("Enter row # " + (i + 1) + ": ");
            String[] line = scan.nextLine().split(" ");
            if(line.length != db[i].length){
                System.out.println("Error");
                i--;
            }else{
                db[i] = line;
            }
        }

        System.out.println("Enter a string to find: ");
        String find = scan.nextLine();

        if(!find.equals("exit")) {

            for (int k = 0; k < db.length; k++) {
                for (int j = 0; j < db[k].length; j++) {
                    if (db[k][j].contains(find)) {
                        System.out.println(Arrays.deepToString(db[k]));
                    }

                }
            }
        }
    }// добавить while, находит все вхождения




    public static void format(){

        System.out.printf("---%d--", 10);
        System.out.println();
        System.out.printf("---%5d--", 10);
        System.out.println();
        System.out.printf("---%-5d--", 10);
        System.out.println();
        System.out.printf("---%d---%s--", 10, "Hello");
        System.out.println();
        System.out.printf("---%d---%s--%tB", 10, "Hello", new Date());
        System.out.println();
        System.out.printf("---%d---%s--%tB", 10, "Hello", new Date());





    }








}
