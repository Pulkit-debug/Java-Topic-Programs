package Practice_Problems;
import java.util.*;
public class Sort_IN_Specific_Order {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		        int n = sc.nextInt();
		        int a[] = new int[n];
		        int a2[] = new int[n];
		        
		        
		        for(int i =0;i<n;i++)
		        {
		            a[i] = sc.nextInt();
		        }
		        int m = n;
		        Arrays.sort(a);
		        
		        int i =0;
		        n--;
		        
		    while(n >= 0)
		    {
		    	if(a[n] % 2 !=0)
		    	{
		    		a2[i] = a[n];
		    		i++;
		    	}
		    	n--;
		    	
		    }
		    n++;
		    while(n < m)
		    	{
		    	
		    	if(a[n] % 2 == 0)
		    	{
		    		a2[i] = a[n];
		    		i++;
		    	}
		    	n++;
		    	}
		    
		    for(int x = 0;x <m;x++)
		    	System.out.print(a2[x] + " ");
		    
		        System.out.println();
		}


	}

}
