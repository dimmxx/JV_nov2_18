package exc;

import ext.Voice;

public class Dog extends Animal implements Voice, SecondI {

	public Dog(String name) {
		super(name);
	}

	Owner owner = new Owner();

	void getInfo() throws Exception {
		owner.getName();
	}

	@Override
	public void getVoice() {
		// TODO Auto-generated method stub

	}

}
