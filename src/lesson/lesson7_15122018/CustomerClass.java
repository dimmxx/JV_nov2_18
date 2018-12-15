package lesson.lesson7_15122018;

public class CustomerClass {

    private CartClass cart;

    public void addCart(CartClass cart) {
        this.cart = cart;
    }

    public void addProduct(ProductClass product) {
        //if(cart != null) {
        cart.putIntoCart(product);
    }

    public CartClass moveCart(){
        CartClass tempCart = cart;
        cart = null;
        return tempCart;
    }


}

