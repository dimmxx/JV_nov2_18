package lesson.lesson7_15122018;

public class IpadClass extends TabletClass {

    boolean gps;

    IpadClass(String cpu, String display, boolean gps){
        super(cpu, display);
        this.gps = gps;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("GPS: " + gps);

    }




}
