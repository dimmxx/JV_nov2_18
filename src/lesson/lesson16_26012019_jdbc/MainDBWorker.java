package lesson.lesson16_26012019_jdbc;

public class MainDBWorker {

    public static void main(String[] args) {

        DBWorker worker = new DBWorker();

        Mate mate = new Mate();


        mate.setName("Peter");
        mate.setAge(30);

        //System.out.println(worker.addMate(mate) ? "Query OK" : "Error");
        //System.out.println(worker.getMate(3));
        //System.out.println(worker.getMateX(8));


        System.out.println(worker.getMateSetAllDistinct());


        worker.close();


    }



}
