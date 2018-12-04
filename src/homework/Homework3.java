package homework;
import java.util.Scanner;




public class Homework3 {

    public static void main(String[] args) {

        runDog3D();


    }




    public static void runDog3D(){
        char[][] array = new char[10][10];
        for (int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++) array[i][k] = '_';
        }

        char dog = '@';
        array[0][0] = dog;
        int pos = 0;
        int high = 0;

        Scanner scan = new Scanner(System.in);

        printRunDogMatrix(array);

        do {

            if (scan.hasNext("d")) {
                array[pos][high] = '_';
                if (pos != array.length - 1){
                    pos++;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("a")) {
                array[pos][high] = '_';
                if (pos != 0){
                    pos--;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("s")){
                array[pos][high] = '_';
                if (high != array[pos].length - 1){
                    high++;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("w")){
                array[pos][high] = '_';
                if (high != 0){
                    high--;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else {
                printRunDogMatrix(array);
                System.out.println(" Press A, D, W or S!");
                scan.next();
            }

        } while (true);
        scan.close();
    }

    public static void printRunDogMatrix(char[][] array){
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.println();
            for (int k = 0; k < array[i].length; k++){
                System.out.print(array[k][i]);
            }
        }
        System.out.println();
    }




}
