package lesson.lesson16_26012019_jdbc.sqlite;


public class MainDBWorkerSQLite {


    public static void main(String[] args) {

        DBWorkerSQLite worker = new DBWorkerSQLite();

        Mate mate = new Mate();

        mate.setName("JOHN");
        mate.setAge(20);

        System.out.println(worker.addMate(mate) ? "Query OK" : "Error");


        System.out.println(worker.getMateAll());


        worker.close();


    }



}
