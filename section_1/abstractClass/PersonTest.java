package abstractClass;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 5500, 1967, 9, 15);
        people[1] = new Student("Marry Moris", "computer science");

        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
