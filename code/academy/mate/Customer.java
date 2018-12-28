package academy.mate;

public class Customer {
	Cart cart;

	public void addCart(Cart cart) {
		this.cart = cart;
	}

	public void addProduct(Product product) {
		if (cart != null) {
			cart.addProduct(product);
		}
	}
	public Cart moveCart() {
		Cart tempCart=cart;
		cart=null;
		return tempCart;
	}
}
