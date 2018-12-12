package lesson.lesson6_12122018;

public class DemoCart {

    public static void main(String[] args) {

        CartClass cart1 = new CartClass();
        ProductClass product1 = new ProductClass();
        ProductClass product2 = new ProductClass();

        product1.setNameGood("Milk");
        product1.setPrice(10);

        product2.setNameGood("Bread");
        product2.setPrice(2);


        cart1.putIntoCart(product1);
        cart1.putIntoCart(product2);

        cart1.printCart();



    }



}
