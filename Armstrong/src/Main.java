
import java.lang.Math;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("N = 3");
		for (int i = 100; i < 1000; i++)
		{
		int sum = 0;
		sum = (int)Math.pow(i / 100, 3) + (int)Math.pow(i % 10, 3) + (int)Math.pow(i / 10 % 10, 3);
		if (sum == i)
		{
			System.out.println(i);
		}
		}
		
		System.out.println("N = 4");
		for (int i = 1000; i < 10000; i++)
		{
		int sum = 0;
		sum = (int)Math.pow(i / 1000, 4) + (int)Math.pow(i % 10, 4) + 
				(int)Math.pow(i / 100 % 10, 4) + (int)Math.pow(i % 100 / 10, 4);
		if (sum == i)
		{
			System.out.println(i);
		}
		}		
	}

}
