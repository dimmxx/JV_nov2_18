package ext;

public class Owner {
	Animal animal;
	
	void setAnimal(Animal animal) {
		this.animal=animal;
	}
	
	void getPet() {
		animal.getInfo();
	}
}
