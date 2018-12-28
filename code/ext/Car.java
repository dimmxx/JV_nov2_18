package ext;

public class Car {
	String mark;
	String model;
	Car(String mark,String model){
		this.mark=mark;
		this.model=model;
	}
	public void getInfo() {
		System.out.print("Mark: "+mark+"; Model: "+model);
	}
	
	
	
}
