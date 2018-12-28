package ext;

public interface Voice {
	String age="10";
	void getVoice();
	
	
	default void someMethod2() {
		System.out.println("Some Method");
	}
	
	default void someMethod() {
		System.out.println("Some Method");
	}
	default void someMethod(int a) {
		System.out.println("Some Method");
	}
}
