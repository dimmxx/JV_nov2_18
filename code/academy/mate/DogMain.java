package academy.mate;

import ext.Dog;

public class DogMain {

	public static void main(String[] args) {
		Dog dog=new Dog("Bob",6,null); 
		Owner owner=new Owner();
		//dog.setName("Susleg");
		//dog.setAge(6);
		//dog.setOwner(owner);
		dog.getInfo();

	}

}
