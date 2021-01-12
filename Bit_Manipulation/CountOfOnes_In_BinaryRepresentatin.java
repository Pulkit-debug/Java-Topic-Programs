package Bit_Manipulation;

public class CountOfOnes_In_BinaryRepresentatin {
	public static int count_One(int n)
	{
		int count = 0;
		while(n > 0)
		{
			n = n & (n-1);
			count++;
			}
		return count;
		
	}
	
	// Function for counting zeros in binay
	public static int count_zero(int n)
	{
		int result = 0;
		while(n > 0)
		{
			n = n & (n-1);
			result++;
		}
		return result;
	}
	public static void main(String[] ars)
	{
		int n = 23;
		int n2 = 1;
		// The basic approach of this program will take log2N time because of the whole mess first we convert the decimal into the bianry and then traverse in the arraay.
		
		System.out.println(count_One(n));
		System.out.println(count_One(n2));
		
	}
	
}
