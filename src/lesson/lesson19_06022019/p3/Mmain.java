package lesson.lesson19_06022019.p3;

import java.util.Set;
import java.util.TreeSet;

public class Mmain {


    public static void main(String[] args) {



        Set<Dog> set = new TreeSet<Dog>((dog1, dog2) -> dog1.age > dog2.age? 1:-1);



    }




}
