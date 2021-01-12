package Practice_Problems;
import java.util.*;
public class Value_equal_to_index_value {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int j =0;j<t;j++)
		{
		    
		    int  n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int i =0;i<n;i++)
		    a[i] = sc.nextInt();
		    
		    for(int i =0;i<n;i++)
		    {
		    if(a[i] == i+1)
		    {
		        System.out.print(i+1 + " ");    
		   
		    }
		    
		    }
		    
		}
		

	}

}
