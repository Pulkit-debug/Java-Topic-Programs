package Practice_Problems;

public class GCD_Of_Two_Numbers {

	public static void main(String[] args) {
		int a = 153;
		int b = 81;
		int gcd =1;
		
		for(int i =1;i<=a && i<=b;i++)
		{
			if(a % i ==0 && b %i ==0)
			{
				gcd = i;
			}
		}

		System.out.println(gcd);
	}

}
