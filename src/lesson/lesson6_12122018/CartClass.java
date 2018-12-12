package lesson.lesson6_12122018;

public class CartClass {

    private ProductClass[] cart = new ProductClass[10];
    int counter = 0;


    public void putIntoCart(ProductClass item) {
        cart[counter] = item;
        counter++;
    }


    public void printCart() {
        for (int i = 0; i < cart.length; i++) {
            System.out.println(cart[i] != null ? cart[i].getNameGood() + " " + cart[i].getPrice() : "-");
        }


    }

    public void removeFromCart(){

        
    }



}
