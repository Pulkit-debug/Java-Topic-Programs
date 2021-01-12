package Sorting_Algorithms;
import java.util. Scanner;
public class Selection_Sort {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] a = {8, 5,-1,9, 2};
		 int n = a.length;
		for(int i =0;i<n-1;i++)
		{
			int min = i;
			for(int j =i;j<n;j++)
			{
				if(a[j] < a[min])
					min =j;
			}
			
			int temp;
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		// Using for each loop here
		for(int x : a)
		{
			System.out.print(x + " ");
		}
		}
	}

