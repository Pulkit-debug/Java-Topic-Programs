package Wrapper_Class;

public class Wrapper_Class_Working {

	public static void main(String[] args) {
		//	Wrapper classes are used to wrap the primitive datatypes to the form of objects so that it can be considered in OOP.
		// Wrapper classes are of types like
		/*
		int 	-> Integer
		char    -> Character
		float   -> Float
		double  -> Double
		boolean -> Boolean 
		byte 	-> Byte
		short   -> short
		
		*/
		
		/*				---------useful Methods of Wrapper classes------
		 * 
		 * 1. valueOf()
		 * 		Static method.
		 * 		Return object reference of relative wrapper class
		 * 
		 * 2. paseXxx()
		 * 		Static method
		 * 		Xxx can be replaced by any primitve type
		 * 		It returns Xxx type value
		 * 
		 * 3. xxxValue()
		 * 		Instance method of wrapper class
		 * 		xxx can be replaced by any primitve type
		 * 		Returns corresponding type
		 */
		Integer i = Integer.valueOf("1011",  2);
		// valueOf function is creating an object of the class which is calling him (Integer class for above case) 
		// Here valueOf is an staic function of class Integer
		Double d = Double.valueOf("1.23");	
		int in = Integer.parseInt("123");	// parse convert the string into the desired format
		double db = Double.parseDouble("23.32");
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(in);
		System.out.println(db);
		}

}
