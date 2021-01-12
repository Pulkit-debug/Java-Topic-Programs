package HackerEarth_Contest_Problems;
import java.util.*;
public class Shubham_And_GCD {

	static int gcd(int a, int b) 
	{ 
	    if (b == 0) 
	        return a; 
	    return gcd(b, a % b);  
	      
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int ans =0;
			
			for(int i =0;i<n;i++)
				a[i] = sc.nextInt();
			for(int i =0;i<n;i++)
				b[i] = sc.nextInt();
			
			for(int i =0;i<n;i++)
			{
				ans += gcd(a[i], b[n-i-1]);
			}
			
			System.out.println(ans);
		}


	}

}
