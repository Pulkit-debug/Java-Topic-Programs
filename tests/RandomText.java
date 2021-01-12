package tests;
import java.math.BigInteger;
import java.util.*;
public class RandomText {

	public static void main(String[] args) {
		
		BigInteger x = new BigInteger("2");
		int n = 100;
		BigInteger result = new BigInteger("1");
		
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		while(n > 0) {
			result.multiply(x);
			n--;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(result + " displayed in " + (end - start) + " seconds");
	}
}
