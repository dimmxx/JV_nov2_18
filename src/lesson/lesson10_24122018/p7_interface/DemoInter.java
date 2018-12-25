package lesson.lesson10_24122018.p7_interface;

public class DemoInter {

    public static void main(String[] args) {


        Dog dog = new Dog("1");

        Animal animal = new Dog("2");

        Voice voice = new Dog("3");

        ((Dog) voice).getVoice();


        System.out.println(Voice.age);




        //// свойство       Интерф                Абст
//                поля          конст            любые поля
//                экз           нельзя создать    нельзя создать
//                конст
   //             методы         abstr default public        любые
 //               наследование     много                один
//

    }







}
