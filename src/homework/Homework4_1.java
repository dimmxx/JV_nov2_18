package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //String line = scan.nextLine();
        String line = "Alex, 19, Kiev; Marry, 21, London; Alex, 52, New-York; Steve, 34, Madrid";
        String[] lineArr = line.split("; ");
        String[][] lineArr3D = new String[lineArr.length][3];
        for(int i = 0; i < lineArr3D.length; i++){
            lineArr3D[i] = lineArr[i].split(", ");
        }
        System.out.println(Arrays.deepToString(lineArr3D));

        String query = "";
        while (!query.equals("exit")){

            System.out.print("Enter a string to find: ");
            query = scan.nextLine();

            for(int i = 0; i < lineArr3D.length; i++){
                for (int k = 0; k < lineArr3D[i].length; k++){
                    if(lineArr3D[i][k].contains(query)) {
                        System.out.println(Arrays.toString(lineArr3D[i]));
                        break;
                    }
                }
            }
        }
    }
}
