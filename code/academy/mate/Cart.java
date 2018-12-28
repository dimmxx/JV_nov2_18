package academy.mate;

public class Cart {
	Product[] products = new Product[10];
	void addProduct(Product product) {
		for(int i=0;i<products.length;i++) {
			if(products[i]==null) {
				products[i]=product;
				break;
			}
		}
	}	
	void showCart() {
		int counter=1;
		for(int i=0;i<products.length;i++) {
			if(products[i]!=null) {
				//System.out.println((counter++)+". "+products[i].getName()+", "+products[i].getPrice());
				products[i].getInfo();
				System.out.println();
			}
		}
	}
}
