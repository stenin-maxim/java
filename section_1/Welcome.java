import static java.lang.Math.*;
import java.util.*;


public class Welcome
{
	public static final double CM_PER_INCH = 24.5;

	public static void main(String[] args)
	{
		String greeting = "Welcome to Core Java!";
		String s = greeting.substring(0, 3) + "!!!";
		double parWidth = 16;
		double sqrt = sqrt(parWidth);
		int x = (int) CM_PER_INCH;
		
		System.out.println(s);

		for (int i = 0; i < greeting.length(); i++) {
			System.out.print("s");
			System.out.println(CM_PER_INCH + parWidth + sqrt + x);
		}

		Constant constant = new Constant();

		//System.out.println(constant.main(args));
		constant.number();
	}

	public static void simple()
	{
		System.out.println("Welcome!!!!");
	}
}

class FirstSample
{
	public static void main()
	{
		System.out.println("Welcome!!!!");
	}
}

class Constant
{
	void number()
	{
		final double CM_PER_INCH = 2.54;

		int a[] = new int[100];
		int[] smallPrimes = new int[100];
		int[] luckyNumbers = Arrays.copyOf(smallPrimes, smallPrimes.length);


		for (int i = 0; i < 100; i++) {
			a[i] = i;
		}

		luckyNumbers[5] = 125;
	
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(smallPrimes));
		


/*		Scanner in = new Scanner(System.in);
		System.out.print("Select 1234");

		int choice = in.nextInt();

		switch (choice) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3: 
				System.out.println("3");
				break;
			default:
				System.out.println("default");
				break;

		} */
		
	}
}





