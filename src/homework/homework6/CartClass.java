package homework.homework6;

import java.util.Scanner;

public class CartClass {

    Scanner scan = new Scanner(System.in);
    private ProductClass[] cart = new ProductClass[10];
    int counter = 0;


    public void putIntoCart(ProductClass item) {
        for(int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                break;
            }else if (i == cart.length - 1 & cart[i] != null){
                System.out.println("Can not add item. The cart is full.");
            }
        }
    }

    public void printCart(){
        double sum = 0;
        int counter = 0;
        for(int i = 0; i < cart.length; i++){
            if(cart[i] != null){
                sum += cart[i].getPrice();
                counter++;
                System.out.println( counter + ". " + cart[i].getNameGood() + " $" + cart[i].getPrice());
            }
        }
        if (sum == 0) System.out.println("The cart is empty");
        System.out.println("--------------------------------------");
        System.out.println("Total: $" + sum);
        System.out.println(counter + "/" + cart.length + " (" + (cart.length - counter) + " free cells left)");
        System.out.println();

    }

    public void removeFromCart(String name){
        for (int i = 0; i < cart.length; i++){
            if(cart[i] != null && cart[i].getNameGood().equals(name)){
                cart[i] = null;
            }
        }
    }
}
