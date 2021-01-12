package Sorting_Algorithms;
import java.util.Scanner;
public class Bubble_Sort {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		for(int i =0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i =0;i<n-1;i++)
		{
			boolean sorted = true ;
			for(int j =0;j<n-i-1;j++)
			{
				
				if(a[j] > a[j+1])
				{
					int temp ;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					sorted = false;
				}
				
			}
			if(sorted)
				break;
		}
		
		for(int i =0;i<n;i++)
			System.out.print(a[i] + " ");
	}
}
