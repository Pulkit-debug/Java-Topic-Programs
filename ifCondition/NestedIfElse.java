package ifCondition;

public class NestedIfElse {
	public static void main(String[] args) 
	{
		
	int a = 10, c= 30;
	int b = 4;
	
	int result = 0;
//	
//	if (a > b) {
//		
//		if (a> c) {
//			
//			result = a;
//		}
//	}
//		else {
//			
//			if(b > c) {
//				
//				result = b;
//			}
//			
//			else {
//				
//				result = c;			
//			}
//			
//		}
//		
//	
//	
//		System.out.println("The greatest number is : " + result);
	
	
	// Ternary operator (Short hand method )
	
	result = a > b ? a > c ? a : c : b > c ? b : c;

		System.out.println(" The greatest number is : " + result);
	}
	
}
