package lesson.lesson19_06022019_file_lambda.file3;

import java.io.File;
import java.util.Scanner;

public class Main3 {

        public static void main(String[] args) {

        String testPath = "/home/master/Documents/Test_DIR";

        Scanner scanner = new Scanner(System.in);

        while (true) {
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


            switch (move) {

                case "cd ..":
                    testPath = files.getParent();
                    break;
                default:
                    if (new File(testPath + "/" + move).exists())
                        testPath += "/" + move;
            }
        }
    }
}
