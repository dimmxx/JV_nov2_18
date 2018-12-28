package less;

public class DogMain {

	public static void main(String[] args) {
		Dog dog1=new Dog(null,5);
		Dog dog2=new Dog("Susleg",5);
	//	System.out.println(dog1.equals(dog2));
		System.out.println(dog1.hashCode());
		System.out.println(dog2);
		String s="123";
		System.out.println(s);
		
	}

}
