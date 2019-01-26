package lesson.lesson16_26012019_jdbc;

public class MainDBWorker {


    public static void main(String[] args) {

        lesson.lesson16_26012019_jdbc.DBWorker worker = new lesson.lesson16_26012019_jdbc.DBWorker();

        Mate mate = new Mate();


        mate.setName("JOHN");
        mate.setAge(20);





        System.out.println(worker.addMate(mate) ? "Query OK" : "Error");


        System.out.println(worker.getMateAll());


        worker.close();


    }



}
