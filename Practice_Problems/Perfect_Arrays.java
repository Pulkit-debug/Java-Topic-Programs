package Practice_Problems;
import java.util.*;
public class Perfect_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int flag =0;
		    for(int i =0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		    for(int i =0;i<n;i++)
		    {
		        if(a[i] !=a[n-i-1])
		        {
		        	flag =1;
		        	break;
		        }
		           
		        }
		    
		    if(flag == 0)
		    System.out.println("PERFECT");
		    else
		    System.out.println("NOT PERFECT");
	}

	}

}
