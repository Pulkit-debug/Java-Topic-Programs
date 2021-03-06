package bigInteger_Question;

import java.util.Arrays;
import java.math.*;
import java.util.Scanner;
public class biggiInteger {
	
	public static void main(String[] args) {
			
		   Scanner sc = new Scanner(System.in);
		   int t = sc.nextInt();
		   while(t-->0) {
			   BigInteger n = sc.nextBigInteger();

			   int two = 2;
			   int flag = 0;
			   BigInteger one = new BigInteger("1");
			   BigInteger three = new BigInteger("3");

			   if(n.mod(BigInteger.valueOf(two)).equals(BigInteger.ZERO)) {
				   while(n.compareTo(one) >= 1) {
					   n = n.shiftRight(1);
					   if(n.compareTo(one) == 0) {
						   flag = 1;
						   break;
						   }
				   }
			   }
			   else {
				   n = n.multiply(three).add(one);
				   while(n.compareTo(one) >= 1) {
					   n = n.shiftRight(1);
					   if(n.compareTo(one) == 0) {
						   flag = 1;
						   break;
						   }
				   }
			   }
			   if(flag == 1) System.out.println("YES");
			   else System.out.println("NO");
		   }
	}
	}