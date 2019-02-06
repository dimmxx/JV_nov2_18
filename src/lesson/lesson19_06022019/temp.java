package lesson.lesson19_06022019;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temp {

//    public static void main(String[] args) {
//
//        File file = new File("/home/master/IdeaProjects/JV_nov2_18/");
//        System.out.println(file);
//        System.out.println(file.getName());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.listFiles());
//
//        for (File file1 : file.listFiles()) {
//            if (file1.isFile()) {
//                System.out.println(file1.getName());
//            }
//        }
//
//        for (File file1 : file.listFiles()) {
//            if (file1.isDirectory()) {
//                System.out.println(file1.getName());
//            }
//        }
//    }
//======================================================================================================


//    public static void main(String[] args) {
//
//
//        String path = "/home/master/IdeaProjects/JV_nov2_18/";

//        //System.out.println(file.getParent());
//
//        Scanner scanner = new Scanner(System.in);
//
//        int i = 10;
//
//        System.out.println(path);
//
//        while (i > 0){
//            File file = new File(path);
//            System.out.println(path);
//
//            if (scanner.nextLine().equals("cd ..")){
//                path = file.getParent();
//
//            } //else if (scanner.nextLine().equals())

//        }
//
//
////        for (File file1 : file.listFiles()) {
////            if (file1.isDirectory()) {
////                System.out.println(file1.getName());
////            }
////        }
//    }


//    public static void main(String[] args) {
//
//        String path = "/home/master/IdeaProjects/JV_nov2_18/";
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            File files = new File(path);
//            System.out.println(files);
//            for (File file : files.listFiles()) {
//                if (file.isDirectory()) {
//                    System.out.println("\t" + file.getName());
//                }
//            }
//            String move = scanner.nextLine();
//            switch (move) {
//
//                case "..":
//                    path = files.getParent();
//                    break;
//                default:
//                    if (new File(path + "/" + move).exists())
//                        path += "/" + move;
//            }

//        }
//
//
//    }
//====================================================================================================

//    public static void main(String[] args) {
//
//        String path = "/home/master/IdeaProjects/JV_nov2_18/rrr";
//
//        File file = new File(path);
//        System.out.println(file.exists());
//        System.out.println(file.mkdir());
//
//
//    }

//=====================================================================================================


//    public static void main(String[] args) throws IOException {
//
//        String c = "/home/master/IdeaProjects/JV_nov2_18/rrr/creds.xml";
//        String c2 = "/home/master/IdeaProjects/JV_nov2_18/creds.xml";
//
//        Path p1 = Paths.get(c);
//        Path p2 = Paths.get(c2);
//
//        System.out.println(Files.exists(p1));
//
//        Files.copy(p2, p1);
//
//    }


//====================================================================================================

//    public static void main(String[] args) throws IOException {
//
//        String c1 = "/home/master/IdeaProjects/JV_nov2_18/rrr/creds.xml";
//        String c2 = "/home/master/IdeaProjects/JV_nov2_18/creds.xml";
//
//        Path p1 = Paths.get(c1);
//        Path p2 = Paths.get(c2);
//
//        Files.copy(p2, p1);
//
//        Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
//
//
//    }

    public static void main(String[] args) {




    }





}
