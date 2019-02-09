package lesson.lesson19_06022019_file_lambda.p4_denis;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// AnotherClass ac=new AnotherClass();
		/*
		MyInt ac = new MyInt() {
			@Override
			public void doSomething() {
				System.out.println("Doing something from MyInt");
			}
		};

		SomeClass sc = new SomeClass();
		sc.someMethod(() -> System.out.println("Doing something from MyInt"));
		sc.someAnotherMethod(5,1,(a, b) -> "a+b=" + (a + b));
	*/
		Comparator<Dog> comp=new Comparator<Dog>() {
			@Override
			public int compare(Dog dog1, Dog dog2) {
				return dog1.age>dog2.age?1:-1;
			}
		};
		Set<Dog> set=new TreeSet<Dog>((dog1,dog2)->dog1.age>dog2.age?1:-1);
	}

}
