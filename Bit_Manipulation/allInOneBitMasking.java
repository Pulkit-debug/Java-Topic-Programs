package Bit_Manipulation;

public class allInOneBitMasking {
	
	static void decimalToBinary(int n) {
		String s = "";
		
		while(n > 0) {
			s += n & 1;	
			// in above step we have used (n&1) in place of (n%2) because it gives us the same result either 0 or 1
			n = n >> 1;
			// using right shift operator to divide n by 2 everytime (using these operators because they make the code bit faster)
		}
		
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	static void totalNoOfBits(int n) {
		System.out.println("Total number of Bits are: " + (int)(Math.log(n) / Math.log(2) + 1));
		
		// Here we are just solving log of n to the base 2 ( using base 2 cause of bits)
		// Math Behind----
			// Let's say we have number 13 which lies in between 8 and 16
			// So we can write 8 as 2^3 and 16 as 2 ^ 4
			// doing basic math on both of these we get: 3log2 = 3  and  4log2 = 4
			// so we add 1 to both of them and we get the desired bits count.
	}
	
	static void totalNoOfDigits(int n) {
		System.out.println("Total number of Digits are: " + (int)(Math.log(n) / Math.log(10) + 1));
		
		// See the above Explanation where we counted totalNoOfBits
	}
	
	static void bitAtX(int n, int x) {
		if(((1 << x) & n) != 0) {
			System.out.println("Bit Present is 1");
		}
		else System.out.println("Bit Present is 0");
	}
	
	static void setBitAtX(int n, int x) {
		n = ((1 << x) | n);
		System.out.print("The resulted Bits are: ");
		decimalToBinary(n);
	}
	
	static void clearBitAtX(int n, int x) {
		n = ((~(1 << x)) & n);
		System.out.print("The resulted Bits are: ");
		decimalToBinary(n);
	}
	
	static void bitsToConvertAToB(int a, int b) {
		
		System.out.println();
		System.out.println("----------BITS TO CONVERT A TO B---------------");
		System.out.print("Bits of a: ");
		decimalToBinary(a);
		System.out.print("Bits of b: ");
		decimalToBinary(b);
		
		int n = a ^ b;
		// This operation will give 1 at places where there are two different bits so 
		// now we only have to calculate how many total set bits are present.
		
		// So here the Questions changes and becomes like that: Q.-> How many set bits are there?
		
		// There is one trick that we use to calculate the set bits 
		
		// n & (n-1) this logic will convert the most last set bit to zero
		// so now we have to find that how many set bits are converting to zero.
		
		int count = 0;
		while(n > 0){
			n = n & (n-1);
			count++;
		}
		
		System.out.println("Bits required to change a to b are: " + count);
	}
	
	public static void main(String[] args) {
		
		// Q1. Convert Decimal Number to binary
		// Q2. Count number of bits in a number in O(1) Time Complexity.
		// O3. Count number of digits in a number in O(1) Time Complexity.
		// Q4. What is the Bit at given number x(0/1).
		// Q5. Set ith Bit.
		// Q6. Clear the ith Bit.
		// Q7. Find the number of Bits to convert a into b;
		
		int n = 12;
		int x = 2;
		
		int a = 23;
		int b = 28
				;
		decimalToBinary(n);
		
		totalNoOfBits(n);
		totalNoOfDigits(n);
		bitAtX(n, x);
		setBitAtX(n, 1);
		clearBitAtX(n, 1);
		bitsToConvertAToB(a, b);
	}

}
