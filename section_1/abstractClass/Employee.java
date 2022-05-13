package abstractClass;

import java.time.LocalDate;

public class Employee extends Person
{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary,int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }
}
