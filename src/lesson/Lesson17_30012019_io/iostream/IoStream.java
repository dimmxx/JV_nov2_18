package lesson.Lesson17_30012019_io.iostream;

import java.io.*;
import java.util.Scanner;

public class IoStream {

    public static void main(String[] args) throws IOException {


//        try (
//                FileInputStream fis = new FileInputStream("putty.msi");
//                FileOutputStream fos = new FileOutputStream("putty_copy.msi");
//
//        ) {
//
//            int temp;
//            while ((temp = fis.read()) != -1){
//                fos.write(temp);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (
//                FileReader fir = new FileReader("README.txt");
//                FileWriter fow = new FileWriter("README_copy.txt");
//
//        ) {
//
//            int temp;
//            while ((temp = fir.read()) != -1){
//                fow.write(temp);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//


//        try (
//                BufferedReader inputStream = new BufferedReader(new FileReader("README.txt"));
//                PrintWriter outputStream = new PrintWriter("README_copy.txt");
//
//        ) {
//
//            String l;
//            while ((l = inputStream.readLine()) != null){
//                outputStream.print("\n" + l);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        FileWriter fow = new FileWriter("README_copy111.txt");
//        Scanner sc = new Scanner(new File ("README.txt"));
//
//        while (sc.hasNext()){
//            fow.write(sc.nextLine());
//        }
//        sc.close();
//        fow.close();


//        Scanner sc = new Scanner(new File ("README_copy111.txt"));
//
//        while (sc.hasNext()){
//            if(sc.hasNextInt()){
//                System.out.println(sc.nextInt());
//            } else{
//                sc.next();
//            }
//
//        }
//        sc.close();


// посчитать сумму
//         Scanner sc = new Scanner(new File ("README_copy111.txt"));
//
//        while (sc.hasNext()){
//            if(sc.hasNextInt()){
//                //System.out.println(sc.nextInt());
//                sc.next();
//            } else if (sc.hasNextDouble()){
//                System.out.println(sc.nextDouble());
//            } else{
//                sc.next();
//            }
//        }
//        sc.close();
//

// посчитать сумму
//        Scanner sc = new Scanner(new File("README_copy111.txt"));
//
//        while (sc.hasNext()) {
//            if (sc.hasNextDouble()) {
//                String temp = sc.next();
//                try {
//                    Integer.parseInt(temp);
//
//                } catch (Exception e) {
//                    System.out.println(temp);
//
//                }
//
//            } else {
//                sc.next();
//            }
//        }
//        sc.close();
//
//

//        Scanner sc = new Scanner(new File("README_copy111.txt"));
//        sc.useDelimiter("a");
//        while (sc.hasNext()) {
//            System.out.println(sc.next());
//        }
//        sc.close();


        Console console = System.console();
        if (console == null){
            System.exit(66613);
        }
        String login = console.readLine();
        char[] password = console.readPassword();
        System.out.println("PSW " + password );










   }


}

