package Practice_Problems;
import java.util.*;

public class Game_With_Nos_Xor_Operation {
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
			
			int a2[] = new int[n];
			for(int i =0;i<n;i++)
			{
				if(i == (n-1))
				{
					a2[n-1] = a[n-1];
				break;
				}
				a2[i] = a[i] ^ a[i+1];
			}
			
			for(int x : a2)
				System.out.print(x + " ");
			System.out.println();
			
		}
		
		
		
		
	}
}
