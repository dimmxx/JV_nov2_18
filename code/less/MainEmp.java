package less;

public class MainEmp {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Zeus", 1600, 2013, 5, 23);
		staff[1] = new Employee("Huskar", 1800, 2012, 7, 21);
		staff[2] = new Boss("Luna", 1900, 2011, 2, 27);
		for (Employee employee : staff) {
			employee.getInfo();

		}
	}

}
