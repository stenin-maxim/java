package abstractClass;

public class Student extends Person
{
    private String major;

    /**
     *
     * @param name Имя студента
     * @param major Специализация студента
     */
    public Student(String name, String major)
    {
        super(name);
        this.major = major;
    }

    public String getDescription()
    {
        return "a student majoring in " + this.major;
    }
}
