package Algorithms.Two_Pointer_Algorithm;
import java.util.*;
public class Find_Triplets_Two_Pointer_Algorithm {

	//Given an array A[] of N elements. The task is to complete the function which returns true if triplets exists in array A whose sum is zero else returns false.
	static class Triplets
	{
		public static boolean FindTriplets(int a[], int n)
		{
			// Brute Force Method :- We can use Three loops
//			 int flag =0;
//			for(int i =0;i<n;i++)
//			{
//				for(int j =1;j<n;j++)
//				{
//					for(int k = 2;k<n;k++)
//					{
//						if(a[i] + a[j] + a[k] == 0)
//						{
//							flag = 1;
//						}
//					}
//				}
//			}
//			if(flag == 1)
//				return true;
//			else
//				return false;
			
			
			// Now The Two Pointer Algorithm
			Arrays.sort(a);
			for(int i =0;i<n-2;i++)
			{
				if(twoSum(a, -a[i], i+1)); return true;
			}
			
			return false;
		}
		
		public static boolean twoSum(int a[], int x, int i)
		{
			
			int j=a.length-1;
			while(i<j)
			{
				if(a[i] + a[j] > x)
					j--;
				else if(a[i] + a[j] < x)
					i++;
				else
					return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i =0;i<n;i++)
				a[i] = sc.nextInt();
			Triplets g = new Triplets();
			if(g.FindTriplets(a, n))
			{
				System.out.println("1");
			}
			else
				System.out.println("0");
			
		}

	}

}
