package Bit_Manipulation;
import java.util.*;
public class Subsets_Of_Set {
	public static void subSets(int a[], int n)
	{
		// This outerr for loop will run upto all the possible subsets
		// Here variable i is acting as a binary counter
		for(int i =0; i < (1 << n); i++)
		{
			// This inner loop will run upto all the elemtns of the array to find all the possible subsets
			for(int j = 0 ; j < n ; j++)
			{
				if((i & (1 << j)) > 0)
				System.out.print("{" + " " + a[j] + " " + "}");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// Generating all the possible Subsets of a set
		// A set can only contain 2^n subsets which can be represented as 1 << n
		Scanner sc = new Scanner(System.in);
		int n ;
//		String s = "abc";
//		char a[] =s.toCharArray();
		int a[] = {3, 2, 0, 7, -1};
		n = a.length;
//		System.out.println(n);
		subSets(a, n);
		
	}

}
