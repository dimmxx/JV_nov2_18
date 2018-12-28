package exc;

import java.io.File;
import java.util.Scanner;

import ext.Voice;

public class MyE {

	public static void main(String[] args) {
		Dog dog = new Dog("1");
		Animal animal = new Dog("2");
		Voice voice = new Dog("3");
		voice.getVoice();
		System.out.println(Voice.age);
		dog.someMethod();
	}
}
