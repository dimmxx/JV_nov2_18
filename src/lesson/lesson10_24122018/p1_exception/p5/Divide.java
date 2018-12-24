package lesson.lesson10_24122018.p1_exception.p5;

public class Divide {

    private int a;
    private int b;

    protected int divide(int a, int b) throws MateAcademyEx{

        if (a == 0 || b == 0){
            throw new MateAcademyEx();
        }
        return a / b;
    }






}
