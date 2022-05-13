public class StaticTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 75000);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name= " + e.getName() + ",id= " + e.getId() + ",salary= " + e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Next available id= " + n);
    }
}

class Employee
{
    private static int nextId = 1;
    private final String name;
    private final double salary;
    private int id;
    public Employee(String n, double s)
    {
        this.name = n;
        this.salary = s;
    }
    public String getName()
    {
        return this.name;
    }
    public double getSalary()
    {
        return this.salary;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId()
    {
        this.id = nextId; // установить следующий доступный идентификатор
        nextId++;
    }

    public static int getNextId()
    {
        return nextId; // возвратить статическое поле
    }

    public static void main(String[] args)
    {
        Employee e = new Employee("Max", 80000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
