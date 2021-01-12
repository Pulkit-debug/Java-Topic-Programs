package ifCondition;

public class ToFindGreatestNumber {
	public static void main(String[] args) {
		
		int a = 20, c = 54, d = 35;
		int b = 230;
		int result = 0;
		
		if (a > b) {
			
			if (a > c) {
				
				if (a > d) {
					
					result = a;
					
				}
				
			}
			
		}
		
		
		else {
			
			if (b > c) {
				
				if (b > d) {
					
					result = b;
				}
				
			}
			
			if (c > d) {
					result = c;
			
			}
			
			else {
				result  = d;
				
			}
			
		}
		System.out.println(" The greatest number is : " + result);
		
		
	}
}
