package lesson.lesson10_24122018.p3_own_exception;

public class DemoExep {

    public static void main(String[] args) {

        try {
            throw new MateAcademyEx();

        } catch(MateAcademyEx e){
            System.out.println(e.getMessage());

        }
    }

}
