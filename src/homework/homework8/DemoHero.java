package homework.homework8;

public class DemoHero {

    public static void main(String[] args) {

        Hero luna = new Luna("Luna", 40, 10, 20);
        Hero zeus = new Zeus("Zeus", 10, 50, 40);

        Item sword = new Item("Sword", 20, 0);
        Item shield = new Item("Shield", 0, 20);

        luna.setItem(sword, 0);
        luna.setItem(shield, 1);
        zeus.setItem(sword, 0);
        zeus.setItem(shield, 1);

        System.out.println(luna.toString());
        System.out.println(zeus.toString());




        int count = 0;

        while(luna.getHealth() >= 0 || zeus.getHealth() >= 0){

            count++;


            zeus.setHealth(zeus.getHealth() - luna.getStrike());
            luna.setHealth(luna.getHealth() - zeus.getStrike());
            System.out.println("Strike # " + count);
            System.out.println(luna.toString());
            System.out.println(zeus.toString());





       }


    }


}
