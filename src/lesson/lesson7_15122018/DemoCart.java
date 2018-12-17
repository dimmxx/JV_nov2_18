package lesson.lesson7_15122018;

public class DemoCart {

    public static void main(String[] args) {

//      CustomerClass customer = new CustomerClass();
//
//      ProductClass product1 = new ProductClass("Bread", 10);
//
//      CartClass cart = new CartClass();
//
//      CartClass cart1 = customer.moveCart();
//
//      customer.addCart(cart);
//      customer.addProduct(product1);
//
//      cart.printCart();
//




      ProductClass colorProduct = new ColorProduct("bread", 120, "red");
      CartClass cart = new CartClass();
      cart.putIntoCart(colorProduct);
      cart.printCart();



      colorProduct.getInfo();





    }


}
