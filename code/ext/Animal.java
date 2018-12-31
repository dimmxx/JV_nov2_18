package ext;

public class Animal {
	private String name;
	private int age;

	public Animal() {
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void getVoice() {
		System.out.println("Unknown");
	}

	public void getInfo() {
		System.out.println("Animal [name=" + name + ", age=" + age + "]");
	}

}