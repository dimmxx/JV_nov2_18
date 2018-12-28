package less;

public class Boss extends Employee {
	double bonus = 1500;

	public Boss(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}
@Override
public double getSalary() {
	return super.getSalary()+bonus;
}
}
