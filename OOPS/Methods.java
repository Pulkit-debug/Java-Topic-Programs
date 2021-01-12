package OOPS;

public class Methods {
	static int maxOf(int a, int b)
	{
		return a > b ? a : b;
	}
	
	// Here we are doing method overloading (Only parameteres must be different and you are good to go)
	
	static int maxOf(int a, int b, int c)
	{
		return a > b ? a > c ? a : c : b > c ? b : c ;
	}
	
	public static void main(String[] args)
	{
		
		int firstNumber = 34;
		int secondNumber = 23;
		int thirdNumber = 565;
		
		// 	Syntax
		//  public static int methodName(int a, int b)		{
		//  body	}
		
		
		/*	The syntax shown above includes -
		 * 1.Modifier - It defines the access type of method and optional to use
		 * 2.return type - method may return a value
		 * 3.nameOfMethod - This is the method name. The method signature consists of a method name and a parameter list
		 * 4.Parameters - The list of parameters , it is the type order, and number of parameters of a method,These are 
		 * optional the method may contain zero parameters
		 * 5. method body - the method body defines what the method does with the statements
		 * 
		 * */
		
		int result = maxOf(firstNumber, secondNumber, thirdNumber);
		System.out.println("Max of both is : " + result);
	}

}
