package homework.homework19;

import java.io.File;
import java.util.Scanner;

public class FileManagerMain {

    public static void main(String[] args) {

        //String testPath = "/home/master/Documents/Test_DIR"; //LINUX
        String testPath = "/Users/mint/Documents/Test_DIR"; //Mac


        Scanner scanner = new Scanner(System.in);

        boolean go = true;

        while (go) {
            File files = new File(testPath);
            System.out.println(files);


            for (File file : files.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println("[" + file.getName() + "]");
                }
            }
            for (File file : files.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }

            String move = scanner.nextLine();
            String moveMod = move.substring(3);

            System.out.println(move);
            System.out.println(moveMod);
            System.out.println(move.substring(0 ,2));

            if (move.equals("cd ..")) {
                testPath = files.getParent();

            } else if (move.substring(0 ,3).equals("cd ") & new File(testPath + "/" + moveMod).exists()){
                testPath += "/" + moveMod;
        }

            else if(move.equals("exit")){
                go = false;
            } else {
                System.out.println("-bash: command not found...");
            }





        }
    }








}
