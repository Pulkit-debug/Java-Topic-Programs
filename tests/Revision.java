package tests;
import java.util.Scanner;
public class Revision {
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols : ");
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		
		for(int i =0;i<rows;i++)
		{
			for(int j =0;j<cols;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<rows;i++)
		{
			for(int j =0;j<cols;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		 
		for(int i =0;i<rows;i++)
		{
			for(int j =0;j<cols;j++)
			{
				
				for(int k =0;k<rows;k++)
				{
					c[i][j] += a[k][i] * b[j][k];
				}
			}
		}
		
		for(int i =0;i<rows;i++)
		{
			for(int j =0;j<cols;j++)
			{
				System.out.print(c[j][i] + " ");
			}
			System.out.println();
		}
		
		//MultiDimensinal array
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of rows : ");
//		int rows = sc.nextInt();
//		System.out.println("Enter the number of cols : ");
//		int cols = sc.nextInt();
//		int a[][] = new int[rows][cols];
//		
//		int b[][] = new int[rows][cols];
//		int c[][] = new int[rows][cols];
//		
//		System.out.println("Enter your first matrix");
//		for(int i =0;i<rows;i++)
//		{
//			for(int j =0;j<cols;j++)
//			{
//				a[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Enter your second matrix");
//		for(int i =0;i<rows;i++)
//		{
//			for(int j =0;j<cols;j++)
//			{
//				b[i][j] = sc.nextInt();
//			}
//		}
//		
//		for(int i =0;i<rows;i++)
//		{
//			for(int j =0;j<cols;j++)
//			{
//				c[i][j] = a[i][j] + b[i][j]; 
//			}
//		}
//		System.out.println("Sum of both the  matrix");
//		for(int i =0;i<rows;i++)
//		{
//			for(int j =0;j<cols;j++)
//			{
//				System.out.print(c[i][j] + " "); 
//			}
//			System.out.println();
//		}
//		
//		
		
//		int n  = 2343;
//		
//		int total = (int)Math.log10(n) + 1;
//		System.out.println(total);
	}
// Arrays are a data structures(Keep in mind)
	
	
	
	
	
	
	
	
	
	
	
	
}
