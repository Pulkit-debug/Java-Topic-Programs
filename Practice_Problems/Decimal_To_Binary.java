package Practice_Problems;
import java.util.*;
public class Decimal_To_Binary {
	
	public static void To_Binary(int n)
	{
		int binary[] = new int[n];
		int i=0;
		while(n> 0)
		{
			
			binary[i] = n %2;
			n = n/2;
			i++;
			
		}
		
		for(int j = i-1;j>=0;j-- )
		{
			System.out.print(binary[j]);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your number in decimal : ");
		int n = sc.nextInt();
		
		To_Binary(n);
		
	}
}
