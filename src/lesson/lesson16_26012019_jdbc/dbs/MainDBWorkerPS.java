package lesson.lesson16_26012019_jdbc.dbs;

public class MainDBWorkerPS {


    public static void main(String[] args) {

        DBWorkerPS worker = new DBWorkerPS();

        Mate mate = new Mate();


        mate.setName("DIMA");
        mate.setAge(20);





        System.out.println(worker.addMate(mate) ? "Query OK" : "Error");


        //System.out.println(worker.getMateX(1));


        worker.close();


    }



}
