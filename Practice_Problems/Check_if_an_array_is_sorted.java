package Practice_Problems;
import java.util.*;
public class Check_if_an_array_is_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++)
		{
		    int flag =1;
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i = 0;i<n;i++)
		    {
		        
		        a[i] = sc.nextInt();
		        b[i] = a[i];
		    }
		    
		    Arrays.sort(a);
		    for(int i =0;i<n;i++)
		    {
		        if(a[i] == b[i] )
		        {
		            flag =0;
		        }
		        else
		        flag =1;
		    }
		    
		    if(flag ==0)
		    {
		        System.out.println("1");
		    }
		    else
		    System.out.println("0");
		    
		}
	}

}
