package lesson.lesson19_06022019_file_lambda.file2;

import java.io.File;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {

        String testPath = "/home/master/Documents/Test_DIR";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            File file = new File(testPath);
            System.out.println(testPath);

            if (scanner.nextLine().equals("cd ..")) {
                testPath = file.getParent();
            }
        }
    }
}
