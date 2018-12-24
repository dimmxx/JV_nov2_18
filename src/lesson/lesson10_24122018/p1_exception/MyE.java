package lesson.lesson10_24122018.p1_exception;

import java.util.Scanner;

public class MyE {

    public static void main(String[] args) {

        System.out.println("Start");
        Scanner sc = null;
        try{
            sc.close();
        //}catch (NullPointerException e){
            }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("oops: " + e.getMessage());
            //e.printStackTrace();
        }


        System.out.println("End");

    }


}
