package ext;

public class Skoda extends Car {
	String player="Pioneer";
	Skoda(String mark,String model) {
		super(mark,model);
	}
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("; Player: "+player);
	}
	
}
