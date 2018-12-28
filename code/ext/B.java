package ext;

public class B extends A {
	String name = "I am class B";

	B() {
		getInfo();
		System.out.println("B construct");
	}

	@Override
	void getInfo() {
		System.out.println("B: "+name);
	}
}
