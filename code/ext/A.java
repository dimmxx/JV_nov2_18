package ext;

public class A {
	String name = "I am class A";

	A() {
		getInfo();
		System.out.println("A construct");
	}

	void getInfo() {
		System.out.println("A:"+name);
	}
}
