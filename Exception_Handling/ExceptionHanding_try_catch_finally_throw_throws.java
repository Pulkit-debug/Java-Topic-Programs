package Exception_Handling;

public class ExceptionHanding_try_catch_finally_throw_throws {

	public static void main(String[] args) {
		
//		try {
//			
//		int a[] = new int[5];
//		System.out.println(a[6]);
//		
//		} catch(ArithmeticException a) {
//			
//			System.out.println(a.getMessage() + " You must be diving by zero or some other Arithmetic mistake.");
//			
//		} catch(ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("Array out of bounds error occured");
//			
//		} catch(IllegalArgumentException e) {
//			
//			System.out.println("You must check your typecasting ");
//			
//		} finally {
//			System.out.println("This will run doesn't matter what.");
//		}
//		
//		System.out.println("Most important part of the program and needs to be run");
		
		
		
//		Throw and Throws
		// Here we are managing the function in advance that it might throw and exception following throws exception
		try {
		func();
		} catch(Exception e) {
			System.out.println(e.getMessage() + " Occured");
		}
		
	}
	
	static void func() throws ArrayIndexOutOfBoundsException {	
		// throws is used for to check that the function might throw an exception(shayad) 
		// for this we can handle the function in advance by using the try and catch block.
		int a = 2;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		
		boolean danger = true;
		if(danger)  {
			// throw will immediately throw the exception because he knows that this part is giving an exception.
			throw new ArrayIndexOutOfBoundsException("Array out of bounds");
			// Here new is creating an exception object and throwing at you. :|
			
		}
	}

}
