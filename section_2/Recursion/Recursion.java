class Factorial
{
    int fact(int n)
    {
        int result;

        if (n == 1) return 1;
        result = fact(n-1) * n;
        System.out.println(result);
        return result;
    }
}

public class Recursion
{
    public static void main(String args[])
    {
        String str = "Первая";
        Factorial f = new Factorial();
        System.out.println(f.fact(3));

        System.out.println(str.charAt(3));
    }
}