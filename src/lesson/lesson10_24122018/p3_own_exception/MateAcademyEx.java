package lesson.lesson10_24122018.p3_own_exception;

public class MateAcademyEx extends Exception{

    @Override
    public String getMessage() {
        return "MateAcademyException";
    }
}
