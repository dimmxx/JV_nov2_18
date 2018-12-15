package lesson.lesson7_15122018;

public class TabletClass {

    private String cpu = "Snap";
    private String display = "FullHD";

    public TabletClass(){

    }

    public TabletClass(String cpu, String display){
        this.cpu = cpu;
        this.display = display;
    }

    public void getInfo(){
        System.out.print("CPU: " + cpu + "Display: " + display);
    }



}
