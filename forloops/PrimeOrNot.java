package forloops;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		
		// To check the number is prime or not
		
		Scanner sc = new Scanner(System.in);
	
			int n = sc.nextInt();
		
			boolean isprime = true; 
			// Shorter method
			//
		for (int i = 2; i * i <= n; i++) {
			
			if( n % i == 0) {
				
				isprime = false;
				break;
			}
		}
			if (n < 2) isprime = false;
		
		System.out.println(isprime);
	}
}
