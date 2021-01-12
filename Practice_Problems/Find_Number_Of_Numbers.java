package Practice_Problems;
import java.util.*;
public class Find_Number_Of_Numbers {

	public static int num(int a[], int n, int k)
	{
		
		int occur = 0;
		for(int i=0;i<n;i++) {
			if(a[i]>= 10) 
			{
		char[] num = Integer.toString(a[i]).toCharArray();

		for (int j = 0; j < num.length; j++) {
		if(Character.getNumericValue(num[j]) == k) {
		occur ++;
		}
		}

		}
		else {
		if(a[i] == k) {
		occur ++;
		}
		}
		
		
		}
		return occur;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i = 0; i < n; i++)
			{
				a[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			Find_Number_Of_Numbers g=new Find_Number_Of_Numbers();
			System.out.println(g.num(a,n,k));
		}	
	}

}
