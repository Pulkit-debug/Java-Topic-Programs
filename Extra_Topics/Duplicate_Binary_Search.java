package Extra_Topics;
import java.util.*;
public class Duplicate_Binary_Search {

	public static int binary_duplicate(int a[], int n, int value)
	{
		int first =0, last = n-1;
		int mid = 0;
//		int temp =0;
		
		while(first <=last)
		{
			mid = (first + last)/2;
			if(a[mid] == value)
			{
				return mid;
			}
			else if(value > a[mid])
			{
				first = mid + 1;
			}
			else
				last = mid -1;
		}
	
//		remove_element(a, n, value, temp);
	
		
		return -1;
		
	}
	
//	public static int remove_element(int a[], int n, int value, int temp)
//	{
//		
//		
//		return ;
//		
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The size of the array : ");
		int n = sc.nextInt();
		int b[] = new int[n];
		int a[] = new int[n];
		System.out.println("Entering the elements of the array : ");
		for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
		
		System.out.println("Enter the value to find");
		int value = sc.nextInt();
		int result = binary_duplicate(a, n, value);
		if(result == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element is present at the index " + result);
		
		
		for(int i = 0; i < a.length; i++)
		{
			if(i == result)
			{
				a[i] = -1;
			break;
			}
		}
	
		for(int i =0;i<n;i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
		
		for(int i =0;i<n;i++)
			b[i] = a[i];
		
		System.out.println("Do you want to check again for the element y/n : ");
		char ch = sc.next().charAt(0);
		
		while(true)
		{
		if(ch == 'y')
		{
			result = 0;
			value = sc.nextInt();
			result = binary_duplicate(b, n, value);
			if(result == -1)
				System.out.println("Element is not present in the array");
			else
				System.out.println("Element is present at the index " + result);
//			
//			
//			for(int i = result; i < a.length-1; i++)
//			{
//				a[i] = a[i+1];
//			}
//		
//			for(int i =0;i<n-1;i++)
//				System.out.print(a[i] + " ");
//			
//			System.out.println();
//			
//			for(int i =0;i<n-1;i++)
//				b[i] = a[i];
		}
		else break;
		}
		
	}

}
