package academy.mate;

public class WeightColorProduct extends ColorProduct {

	int weight;

	WeightColorProduct(String n, int p, String color, int weight) {
		super(n, p, color);
		this.weight = weight;
	}

	@Override
	void getInfo() {
		System.out.print("Weight: " + weight + "; ");
		super.getInfo();
	}
}
