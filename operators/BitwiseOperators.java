package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// AND Bitwise Operator
		
//		int a = 5;
//												// 5 -> 101
//												// 6 -> 110
////													&
////												   4 -> 100
//		int b = 6;
//		
//		int c = a & b;
//		
//		System.out.println(c);
		
		// OR Bitwise Operator
		
	//	int a = 10 ;
		
//		10 -> 1010
//		13 -> 1101
//		   |(pipe)
//		15 -> 1111
		 
//		int b = 13;
//		
//		int c = a | b;
//		
//		System.out.println(c);
		
		// Right Shift Operator
		
		//Main Work in binary :- 
			//	13 -> 1101 -> 0110 -> 0011 -> 0001 -> 0000 -> 0000
			
		int a = 10;
		 
		int b = 13;
		
		//Basically b will be divided by 2		
		// Basically a wil be multiplied by 2
		int c = b >> 1;
		
		int d = 10 << 2;
		System.out.println(c);
		System.out.println(d);
	}

}
