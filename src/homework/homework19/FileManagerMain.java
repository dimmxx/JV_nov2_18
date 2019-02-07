package homework.homework19;

import java.io.File;
import java.util.Scanner;

public class FileManagerMain {

    public static void main(String[] args) {

        String testPath = "/home/master/Documents/Test_DIR"; //LINUX

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


            System.out.println(move);

            if(move.equals("cd ..")){
                testPath = files.getParent();

            }else if(move.equals(cdDir)){

                if (new File(testPath + "/" + move).exists())
                    testPath += "/" + move;

            }else if(move.equals("exit")){
                go = false;
            }





        }
    }








}
