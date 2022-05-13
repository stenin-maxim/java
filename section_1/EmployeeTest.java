import java.time.*;
import java.util.ArrayList;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 7500, 1987, 12, 9));
        staff.add(new Employee("Harry Hacker", 5500, 1967, 9, 15));
        staff.add(new Employee("Jon Tester", 8500, 1997, 1, 5));
        staff.add(new Employee("Roy"));

        // поднять работникам зарпдату на 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary="
                    + e.getSalary() + ", hireDay " + e.getHireDay());
    }
}
class Employee
{
    final private String name;
    private double salary;
    private LocalDate hireDay;
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    public Employee(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }
    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
