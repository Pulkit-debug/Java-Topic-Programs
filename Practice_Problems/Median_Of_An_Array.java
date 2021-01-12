package Practice_Problems;
import java.util.*;
public class Median_Of_An_Array {

	public static double findMedian(int a[], int size) 
    { 
     
        Arrays.sort(a); 
  
 
        if (size % 2 != 0) 
        return (double)a[size / 2]; 
      
        return (double)(a[(size - 1) / 2] + a[size / 2]) / 2.0; 
    } 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
        int size = a.length;
        System.out.println("Median is = " + findMedian(a, size));  

	}

}
