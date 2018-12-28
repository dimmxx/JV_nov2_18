package less;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	String name;
	double salary;
	Date hireDay;

	public Employee(String name, double salary, int year,
			int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = new GregorianCalendar(year, month - 1, day).
				getTime();
	}
	public double getSalary() {
		return salary;
	}
	public void getInfo() {
		System.out.println(name+" ; "+getSalary() +" ; "+hireDay);
	}
}
