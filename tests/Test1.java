package tests;
import java.util.Arrays;
import java.math.*;
import java.util.Scanner;
public class Test1 {
	
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
		   
//	        int t = sc.nextInt();
//	        while(t-->0)
//	        {
//	            int n = sc.nextInt();
//	            int count = 0;
//	            sc.nextLine();
//	            String s = sc.nextLine();
//	            
//	            for(int j =0;j<n;j++)
//	            {
//	                char start = s.charAt(0);
//	            char[] a = s.toCharArray(); // just to convert the string into char array  // Taking the first char and storing it in the first
//	            for(int i =0;i<n-1;i++)
//	            {
//	                 
//	                a[i] = a[i+1];  // Shifting all the char to the left in order to rotate
//	            
//	            }
//	            // if(i == n-1)
//	            //     {
//	                a[n-1] = start; // putting the first elemtn in the last position so that array is rotated
//	                // break;
//	                // }
//	            String news = new String();
//	            news = Arrays.toString(a);
//	             int num = Integer.parseInt(news);
//	            if(num % 2 == 0)
//	            count++;
//	            }
//	            System.out.println(count);
//	        }	}
		   
	}
	

}
