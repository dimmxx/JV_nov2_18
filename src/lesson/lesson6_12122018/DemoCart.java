package lesson.lesson6_12122018;

public class DemoCart {

    public static void main(String[] args) {

        CartClass cart1 = new CartClass();


        ProductClass product1 = new ProductClass("Bread", 10);
        ProductClass product2 = new ProductClass("Milk", 15);

        cart1.putIntoCart(product1);
        cart1.putIntoCart((product2));



        cart1.printCartShort();

        cart1.removeFromCart("Bread");
        cart1.printCartShort();


    }


}
