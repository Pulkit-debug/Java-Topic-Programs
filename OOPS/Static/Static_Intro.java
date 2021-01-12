package OOPS.Static;

public class Static_Intro {

	
	/*					------------Static Keyword---------------
	 * 
	 * :- 	The keyword staitc indicates that the particular member belongs to a type itself, rather than to an instance of that
	 * type. It is mainly used in help of memory management.
	 * 
	 * 	The keyword can be applied to variables, methods, blocks and nested class
	 * 
	 * if you want to declare something that is samne in every object so we use static 
	 * 
	 * static refers to when we have to use something constant everywhere in program
	 * 
	 * */
	
	
	/*				-------Static variables and methods---------
	 * 
	 * 
	 * static int count;
	 * 
	 * static Stirng companyNmae = "Google";
	 * 
	 * Math.PI
	 * 
	 * Math.Integer.MAX_VALUE;
	 * 
	 * static int square(int x)
	 * {
	 * return x*x;
	 * 
	 * }
	 * */
	
	
	/*								------STatic class-----------
	 * 
	 * We cannot declare a top level class with static modifier, but we can declare a nested class as static
	 * 
	 * In Java, you can define  a class with another class. Such a class is called Nested Class. 
	 * 
	 * Nested Class are of two types:Static and non-static
	 * 
	 * 
	 * ex:-
	 * 
	 * class outerClass
	 * 	{
	 * 			....
	 * 
	 * static class staticNestedClass
	 * 		{
	 *			 ....
	 * 		}
	 * 
	 * class innerClass
	 * 		{
	 * 			....
	 * 		}
	 * 
	 * 	}
	 * 
	 * When we use nested class it means that the nested class is closely attached to the outer class and cannot be used freely outside 
	 * without the obj of the outerClass/MainClass.
	 * 
	 * 
	 * but in case of a static nested class that class behaves as it is not closely attached to the mainClass/OuterClass 
//	 * and can be used without the obj of the outerClass(It matters a lot ;> )
	 * 
	 * 
	 * */
	
	
	
	
	
	/*					---------Static Blocks---------
	 * 
	 * static 
	 * {
	 * 		System.out.println(" First static block");
	 * 		B = A * 4 ;
	 * }
	 * 
	 * static 
	 * {
	 * 		System.out.println("Second static block");
	 * 		MAX = 10;
	 * }
	 * 
	 * 
	 * 	static blocks are used when we want to initialize/execute something before the execution of the main function 
	 * 
	 * when we want a particular piece of code to run before the main then we use static (Yes, It is used)
	 * 
	 **/
	
	
	
	
	
	
}
