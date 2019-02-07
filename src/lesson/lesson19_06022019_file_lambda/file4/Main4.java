package lesson.lesson19_06022019_file_lambda.file4;

import java.io.File;

public class Main4 {


    public static void main(String[] args) {

        String path = "/home/master/IdeaProjects/JV_nov2_18/rrr";
        File file = new File(path);
        System.out.println(file.exists());
        System.out.println(file.mkdir());



//        String c = "/home/master/IdeaProjects/JV_nov2_18/rrr/creds.xml";
//        String c2 = "/home/master/IdeaProjects/JV_nov2_18/creds.xml";
//
//        Path p1 = Paths.get(c);
//        Path p2 = Paths.get(c2);
//
//        System.out.println(Files.exists(p1));
//
//        Files.copy(p2, p1);





//        String c1 = "/home/master/IdeaProjects/JV_nov2_18/rrr/creds.xml";
//        String c2 = "/home/master/IdeaProjects/JV_nov2_18/creds.xml";
//
//        Path p1 = Paths.get(c1);
//        Path p2 = Paths.get(c2);
//
//        Files.copy(p2, p1);
//
//        Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);



    }
}
