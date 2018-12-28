package academy.mate;

public class Product {
	String name;
	int price;

	Product(String n, int p) {
		name = n;
		price = p;
	}

	int getPrice() {
		return price;
	}

	String getName() {
		return name;
	}
	
	void getInfo() {
		System.out.print("Name: "+name+";  Price: "+price);
	}
}
