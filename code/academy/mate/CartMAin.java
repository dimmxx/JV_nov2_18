package academy.mate;

public class CartMAin {

	public static void main(String[] args) {
		Product p1 = new Product("Coca-Cola", 10);
		Product p2 = new ColorProduct("Lays", 15,"Yellow");
		Product p3= new WeightColorProduct("Sugar",7,"White",5);
		//Customer customer=new Customer();
		Cart cart = new Cart();
		//customer.addCart(cart);
		//customer.cart.addProduct(product);
		//customer.addProduct(p1);
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
		cart.showCart();
		
		
		//Cart c=customer.moveCart();
		
		
	}

}
