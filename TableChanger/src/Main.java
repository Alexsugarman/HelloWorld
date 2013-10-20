import java.util.Scanner;
import java.lang.Math;

public class Main 
{
	private static Scanner in;

	public static void main(String[] args) 
	{
		int m = 0;
		int n = 0;
		in = new Scanner(System.in);
		System.out.print("Enter M: ");
		m = in.nextInt();
		System.out.println();
		System.out.print("Enter N: ");
		n = in.nextInt();
		System.out.println();
		System.out.println("BEFORE:");
		int myTable[][] = new int [m][n]; 
		int i = 0;
		int j = 0;
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				myTable[i][j] = (int)(Math.random()*10) + 1;
				System.out.print(myTable[i][j] + " ");
			}
		System.out.println();
		}
		
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				if (myTable[i][j] != 0)
				{
					for (int k = j + 1; k < n; k++ )
					{
						if (myTable[i][j] == myTable[i][k])
						{
							deleteNumbers(myTable[i], myTable[i][j]);
							break;
						}
					}
				}
			}
		}
		System.out.println("AFTER:");
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				System.out.print(myTable[i][j] + " ");
			}
		System.out.println();
		}
	}
	
	public static void deleteNumbers(int[] row, int number)
	{
		for (int i = 0; i < row.length; i++)
		{
			if (row[i] == number)
			{
				row[i] = 0;
			}
		}
	}
}
