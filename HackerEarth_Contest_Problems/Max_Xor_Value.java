package HackerEarth_Contest_Problems;
import java.util.*;
public class Max_Xor_Value {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++)
			a[i] = sc.nextInt();
		int max =Integer.MIN_VALUE;
		Arrays.sort(a);
		
//		int ans =0;
		int storeXor =0;
		for(int i =0;i<n;i++)
		{
			for(int j =i;j<n;j++)
			{
				storeXor = a[i] ^ a[j];
				if(storeXor > max)
				{
					max = storeXor;
				}
			}
		}
		
			System.out.println(max);
		}
	}
}
