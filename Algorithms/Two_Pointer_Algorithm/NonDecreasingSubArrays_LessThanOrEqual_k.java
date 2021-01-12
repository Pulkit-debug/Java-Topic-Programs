package Algorithms.Two_Pointer_Algorithm;
import java.util.*;
public class NonDecreasingSubArrays_LessThanOrEqual_k {
	public static int sum(int a[], int x, int n)
	{
		Arrays.sort(a);
		int i =0;
		int j = n-1;
		int count=0;
		while(i < j)
		{
			if(a[i] + a[j] > x)
				j--;
			else if(a[i] + a[j] < x)
			{
				count++;
				i++;
			}
			else
				 count++;
		}
		
		return count;
	}
	public static void main(String[] args)
	{
		// Given an array arr[] of N elements and an integer K
		//Your the task is to find the number of non-decreasing sub-arrays of length less than or equal to K.
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			
			int a[] = new int[n];
			for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
			int k = sc.nextInt();
			
		int result = sum(a, k, n);
		System.out.println("The total number of subarrays present for k are : " + result);
			
		}
		
	}
}	
