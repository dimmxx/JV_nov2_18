package ext;

public class AnimalM {

	public static void main(String[] args) {
		Cat cat=new Cat("Susleg",7);
		Dog dog=new Dog("Krevedko",13);
		Owner owner=new Owner();
		owner.setAnimal(dog);
		owner.getPet();
		Animal animal=new Dog("",4);

	}

}
