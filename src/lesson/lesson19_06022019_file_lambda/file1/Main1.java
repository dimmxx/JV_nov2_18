package lesson.lesson19_06022019_file_lambda.file1;

import java.io.File;

public class Main1 {

    public static void main(String[] args) {

        String testPath = "/home/master/Documents/Test_DIR";

        File file = new File(testPath);
        System.out.println(file);
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.listFiles());

        System.out.println("========================================");

        for (File file1 : file.listFiles()) {
            if (file1.isFile()) {
                System.out.println(file1.getName());
            }
        }

        for (File file1 : file.listFiles()) {
            if (file1.isDirectory()) {
                System.out.println("[" + file1.getName() + "]");
            }
        }
    }

}
