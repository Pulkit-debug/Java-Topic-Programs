package ifCondition;
import java.util.Scanner;

public class IfElsecondition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a  = sc.nextInt();
		
//		if(a % 2 == 0 && a > 1) {
//			System.out.println("The number is even");
//		}
//		else if(a % 2 != 0 && a > 1 )
//		{
//			System.out.println("The number is odd");
//		}
//		
//		else if(a < 0 ) {
//			
//			System.out.println("The number is negetive");
//		}
//		else {
//			System.out.println("The number is zero");
//		}
		
		
		// Shorthand Method
		
		int b = 30;
		
		int c = 49;
		
		int num = 0;
		
		num = b < c ?  b :  c ;
		
		System.out.println(" The small no. is :" + num);
		
	}

}
