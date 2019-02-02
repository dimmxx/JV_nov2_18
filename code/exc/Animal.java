package exc;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
		System.out.println("AnimalExEX constructor");
	}

	//public abstract void getVoice();

	@Override
	public String toString() {
		return "AnimalExEX [name=" + name + "]";
	}

}
