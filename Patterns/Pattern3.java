package Patterns;
import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] arg)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n :");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i =1;i<=n;i++)
		{
		for(int j =1;j<=n-i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
	

}
