package Practice_Problems;
import java.util.Scanner;
public class Reversing_An_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)
				;
		int t = sc.nextInt();
		for(int j =0;j<t;j++)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int i =0;i<n;i++)
		    a[i] = sc.nextInt();
		    
		    for(int i =n-1;i>=0;i--)
		    {
		        System.out.print(a[i] + " ");
		    }
		    System.out.println();
		}

	}

}
