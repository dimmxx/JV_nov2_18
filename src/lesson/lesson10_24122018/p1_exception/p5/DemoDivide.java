package lesson.lesson10_24122018.p1_exception.p5;

public class DemoDivide {

    public static void main(String[] args) {

        Divide divide = new Divide();

        try {
            System.out.println(divide.divide(1, 0));
        } catch (MateAcademyEx e){
            System.out.println(e.getMessage());
        }






    }


}
