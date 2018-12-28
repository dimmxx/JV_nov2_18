package ext;

public class C extends B{
	String name = "I am class C";

	C() {
		getInfo();
		System.out.println("C construct");
	}

	@Override
	void getInfo() {
		System.out.println("C: "+name);
	}
}
