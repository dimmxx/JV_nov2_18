package lesson.lesson9_19122018.p4;

public class Outer {

    private String priOuter;
    public String pubOuter;
    private static String priStatOuter;

    private void priOuterMeth() {
    }

    public void pubOuterMeth() {

        new Inner().priInnerMeth();
    }






    class Inner {

        private String priInner;
        public String pubInner;

        private void priInnerMeth() {
            System.out.println(priOuter + pubInner);
        }

        public void pubInnerMeth() {
        }


    }


    static class Nested{

        static private void getInfo(){
            System.out.println(priStatOuter);
        }



    }







}
