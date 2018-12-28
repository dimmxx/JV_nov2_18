package ext;

public class Cat extends Animal{
	Cat(String name,int age){
		super(name,age);
	}
	@Override
	void getVoice() {
		System.out.println("Miu-Miu");
	}
}
