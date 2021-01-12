package Practice_Problems;
import java.util.*;


public class RotateArray2 {
	public static void rotate(int a[], int d, int n)
			 {
		
				reverse(a, 0, d-1);		// Reversing the left part of the array
				reverse(a, d, a.length-1);		// Reversing the right part of the array
				reverse(a, 0, a.length-1);		// Reversing the whole array 
				display(a);		// Showing the resultant array
			 }
	
	
	public static void reverse(int a[], int start, int end)
	{
		while(start < end)
		{
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		start++;
		end--;
		}
		
	
	}
	
	
	public static void display(int a[])
	{
		for(int i =0;i<a.length;i++)
			System.out.print(a[i] + " ");
	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of your array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the value of d(Number from which to rotate the array : ");
		int d = sc.nextInt();
		System.out.println("Enter the elements of your array : ");
		for(int i =0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		rotate(a, d, n);
		
		
	}
}
