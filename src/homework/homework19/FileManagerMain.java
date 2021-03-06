package homework.homework19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class FileManagerMain {

    public static void main(String[] args) throws IOException {

        //String testPath = "/home/master/Documents/Test_DIR"; //LINUX
        String testPath = "/Users/mint/Documents/test"; //Mac

        Scanner scanner = new Scanner(System.in);
        boolean go = true;

        while (go) {
            File files = new File(testPath);

            System.out.println(files);

            String move = scanner.nextLine();

            if (move.equals("cd ..")) {
                testPath = files.getParent();

            } else if (move.length() >= 3 && move.substring(0, 3).equals("cd ") &&
                    new File(testPath + "/" + move.substring(3)).exists()) {
                testPath += "/" + move.substring(3);

            } else if (move.length() >= 6 && move.substring(0, 6).equals("mkdir ")) {
                new File(files + "/" + move.substring(6)).mkdir();

            } else if (move.length() >= 2 && move.substring(0, 2).equals("ls")) {
                printDirList(files);

            } else if (move.length() >= 3 && move.substring(0, 3).equals("cp ")) {
                String[] line = move.split(" ");
                Path path1 = Paths.get(line[1]);
                Path path2 = Paths.get(line[2]);
                Files.copy(path1, path2);

            } else if (move.length() >= 3 && move.substring(0, 3).equals("rm ")) {
                String[] line = move.split(" ");
                Path path = Paths.get(line[1]);
                System.out.println(path);

                try {
                    Files.delete(path);
                } catch (NoSuchFileException x) {
                    System.err.format("%s: no such" + " file or directory%n", path);
                } catch (DirectoryNotEmptyException x) {
                    System.err.format("%s not empty%n", path);
                } catch (IOException x) {
                    // File permission problems are caught here.
                    System.err.println(x);
                }
            } else if (move.equals("exit")) {
                go = false;

            } else {
                System.out.println("-bash: command not found...");
            }
        }


    }

    public static void printDirList(File files) {
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
    }

}
