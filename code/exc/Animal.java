package exc;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
		System.out.println("Animal constructor");
	}

	//public abstract void getVoice();

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
