package operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		
		int a = 65;
		int b = 20;
		
//		int c = a * a + b * b  + 2 * a * b;
//		int d = (a + b ) * (a + b);
//		
//		 int  e = (int) a / (int) b;
//		
//		int f = a % b;
//		
		int g = b++;
		
		int h = --a;
		
//		System.out.println(c);
//		System.out.println(d);
//	    System.out.println(" This is quotient : " + e);
//		System.out.println(" This is remainder : " + f);
		System.out.println(g + " " + b);
		System.out.println(h + " " + a);
	}

}
