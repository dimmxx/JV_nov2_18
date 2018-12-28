package ext;

public class AM {

	public static void main(String[] args) {
		Animal animal=new Animal();
		Cat cat=new Cat("",7);
		animal.getVoice();
		cat.getVoice();
		Animal a=new Cat("DD",4);
		a.getVoice();
	}

}
