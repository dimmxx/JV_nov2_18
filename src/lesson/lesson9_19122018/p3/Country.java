package lesson.lesson9_19122018.p3;

import java.util.Arrays;

public class Country {

    private String[] array = new String[4];


    public Country(String s1, String s2, String s3, String s4) {
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        array[3] = s4;

    }

    public String[] getArray(){
        return array;
    }

   public void printList(){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
       }



   }





}
