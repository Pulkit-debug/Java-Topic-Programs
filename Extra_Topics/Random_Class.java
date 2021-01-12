package Extra_Topics;
import java.util.Random;
public class Random_Class {
	public static void main(String[] args)
	{
		Random r = new Random();	// Random will provide random values to the array
		int  a[] = new int[5];
		
		for(int i =0;i<a.length;i++)
		{
			a[i] = r.nextInt(10);	// In the parenthesis we are giving the value from which the random values assign to the array must not be greater
		}
		
		
		
			System.out.println(a);	// This is printing the address/hashCode of the object
		
		for(int x : a)		// For each loop
			System.out.print(x + " ");
	}
}
