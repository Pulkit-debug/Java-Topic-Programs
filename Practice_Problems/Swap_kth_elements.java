package Practice_Problems;
import java.util.*;
public class Swap_kth_elements {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	       
	    for(int j =0;j<t;j++)
	    {
	     int temp=0;
	     
		int n = sc.nextInt();
		int a[] = new int[n];
		int x = sc.nextInt();
		for(int i =0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		
//		for(int i =0;i<n;i++)
//		{
//		 if(x == a[i])
//		 {
		    temp = a[x-1];
		    a[x-1] = a[n-x];
		    a[n-x] = temp;
//		 }
//		}
		
		for(int i =0;i<n;i++)
		{
		    System.out.print(a[i] + " ");
		}
	    }
	    
	}
}
