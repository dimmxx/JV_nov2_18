package lesson.lesson8_17122018;

public class DemoEmployee {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Zeus", 1600, 2013, 5, 23);
        staff[1] = new Employee("Luna", 1800, 2012, 7, 21);
        staff[2] = new Boss("Ikar", 2000, 2000, 1, 1);



    for(Employee employee: staff){
        employee.getInfo();

    }

}



}
