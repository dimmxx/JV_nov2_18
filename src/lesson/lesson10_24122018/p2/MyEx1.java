package lesson.lesson10_24122018.p2;

public class MyEx1 {


    public static void main(String[] args) {

        String[] line = new String[2];
        System.out.println("start");

        try {
            //line[3] = "oops";
            System.out.println(10/0);;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounderies");
        } catch (ArithmeticException e){
            System.out.println("zero");
        } catch (Exception e){
            System.out.println("all");
        } finally {
            System.out.println("finally");
        }

        System.out.println("end");
    }












}
