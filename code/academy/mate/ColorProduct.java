package academy.mate;

public class ColorProduct extends Product {
	String color;

	ColorProduct(String n, int p,String color) {
		super(n, p);
		this.color=color;
	}
	@Override
	void getInfo() {
		System.out.print("Color: "+color+"; ");
		super.getInfo();
		
	}

}
