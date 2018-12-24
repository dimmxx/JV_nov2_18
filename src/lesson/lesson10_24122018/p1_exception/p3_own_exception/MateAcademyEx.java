package lesson.lesson10_24122018.p1_exception.p3_own_exception;

public class MateAcademyEx extends Exception{

    @Override
    public String getMessage() {
        return "MateAcademyException";
    }
}
