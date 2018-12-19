package lesson.lesson9_19122018.p2;

public class DemoCar {

    public static void main(String[] args) {


        CarClass car = new CarClass("Skoda", "SuperB", "Blue");
        CarClass car1 = new CarClass("Cherry", "QQ", "Red");

        car.getSound();


        CarClass car2 = new CarClass("Skoda", "SuperB", "Blue"){
            @Override
            public void getSound(){
               System.out.println("Bipp");
            }
        };

        car2.getSound();






    }







}
