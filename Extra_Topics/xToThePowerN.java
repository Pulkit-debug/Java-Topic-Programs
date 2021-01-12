package Extra_Topics;

import java.math.BigInteger;
import java.math.BigInteger;
import java.util.*;
public class xToThePowerN {
	
	public static void slowMethod() {
		BigInteger x = new BigInteger("2");
		int n = 10000;
		BigInteger result = new BigInteger("1");
		
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		while(n > 0) {
			result = result.multiply(x);
			n--;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(result + " displayed in " + (end - start) + " seconds");
	}

	public static void fastMethod() {


		BigInteger x = new BigInteger("2");
		int n = 10000;
		BigInteger result = new BigInteger("1");
		
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		while(n > 0) {
			if(n % 2 == 1) 
			result = result.multiply(x);
			x = x.multiply(x);
			n = n/2;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(result + " displayed in " + (end - start) + " seconds");
		
	}
	public static void main(String[] args) {

		slowMethod();
		fastMethod();
		
	}

}
