package inheritance;

public class ManagerTest
{
    public static void main(String[] args)
    {
        Manager boss = new Manager("Carl Cracker", 8000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 5500, 1967, 9, 15);
        staff[2] = new Employee("Jon Tester", 8500, 1997, 1, 5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary="
                    + e.getSalary());
    }
}
