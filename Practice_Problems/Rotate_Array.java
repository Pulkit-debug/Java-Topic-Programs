package Practice_Problems;
import java.util.*;

//class Rotate
//{
//	public void leftRotate(int arr[], int n, int index)
//	{
//		for(int i=0;i<index;i++)
//		RotateArray(arr, n);	
//		
//	}
//	
//	
//	public void RotateArray(int arr[] , int n)
//	{
//		int temp ;
//		temp = arr[0];
//		for(int i =0;i<n-1;i++)
//		{
//			 
//			arr[i] = arr[i+1];
//			
//		}
//		arr[n-1] = temp;
//		
//	}
//	
//	public void display(int arr[] , int n)
//	{
//		for(int x : arr)
//		{
//			System.out.print(x + " ");
//		}
//	}
//	
//	
//	}
public class Rotate_Array {
	public static void main(String[] arg)
	{
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter your array : ");
		int index = sc.nextInt();
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
//		Rotate rotate = new Rotate();	
//		rotate.leftRotate(arr, n, index);
//		rotate.display(arr, n);
		
		// -------------------SECOND METHOD(best method)-------------------
		
		
		// Reversing the left part of the index 
		for(int i =0;i<index/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[index-i-1];
			arr[index-i-1] = temp;
		}
		
		
		// Reversing the right part of the index
		int tempn = n;
		for(int i =index;i<((index + n)/2);i++)
		{
			int temp = arr[i];
			arr[i] = arr[tempn-1];
			arr[tempn-1] = temp;
			tempn--;
		}
		
		// Reversing the whole array to get the desired output
//		
		for(int i =n-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
		}
		
//				---------------Third Method(bestest Method)--------------
			////////		present in RotateArray2.java class ---------
		
//		Collections.reverse(Arrays.asList(arr));
//		
//		System.out.print(Arrays.asList(arr));
//		
	}

}
