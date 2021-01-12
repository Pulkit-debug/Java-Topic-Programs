package Practice_Problems;
import java.util.*;
public class Print_the_left_element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int i =0;i<a.length;i++)
		    {
		    	a[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(a);
		    
		    int mid =0;
		    if(a.length % 2 ==0)
		    {
		    	mid = a.length/2;
		    	
		    }
		    else
		    {
		    	mid = a.length/2 + 1;
		    	
		   
		    }
		    System.out.println(a[mid-1]);
		}
	}

}
