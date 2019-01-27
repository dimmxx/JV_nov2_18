package lesson.lesson16_26012019_jdbc.sqlite;


public class MainDBWorkerSQLite {


    public static void main(String[] args) {

        DBWorkerSQLite worker = new DBWorkerSQLite();

        //worker.createTable();


        Mate mate = new Mate();

        mate.setName("Helen");
        mate.setAge(19);







        System.out.println(worker.addMate(mate) ? "Query OK" : "Error");


        System.out.println(worker.getMateAllX());


        worker.close();


    }



}
