package lesson.lesson8_17122018;

public class Boss extends Employee {

    private double bonus = 1500;


    public Boss(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }


    @Override
    public double getSalary() {
        return salary + bonus;


    }

}
