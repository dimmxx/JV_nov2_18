package lesson.lesson19_06022019_file_lambda.p3;

import java.util.Set;
import java.util.TreeSet;

public class Mmain {


    public static void main(String[] args) {



        Set<Dog> set = new TreeSet<Dog>((dog1, dog2) -> dog1.age > dog2.age? 1:-1);



    }




}
