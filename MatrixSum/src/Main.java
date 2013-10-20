import java.util.Scanner;


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
		int matrixA[][] = new int [m][n]; 
		int matrixB[][] = new int [m][n]; 
		int matrixC[][] = new int [m][n]; 
		
		int i = 0;
		int j = 0;
		
		System.out.println("A = ");
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				matrixA[i][j] = (int)(Math.random()*10);
				System.out.print(matrixA[i][j] + " ");
			}
		System.out.println();
		}
		
		System.out.println("B = ");
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				matrixB[i][j] = (int)(Math.random()*10);
				System.out.print(matrixB[i][j] + " ");
			}
		System.out.println();
		}
		
		System.out.println("A + B = ");
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
				System.out.print(matrixC[i][j] + " ");
			}
		System.out.println();
		}
		

	}

}
