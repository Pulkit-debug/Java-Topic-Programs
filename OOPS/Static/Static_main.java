package OOPS.Static;

import OOPS.Static.Teacher.Student1;
import OOPS.Static.Teacher.Student2;

public class Static_main {

	// Static blocks 
	// static block are used to initialise something before the execution of main function
	// First static blocks are run before main function
	static
	{
		System.out.println("This is static block 1");
		
	}
	
	static
	{
		System.out.println("This is static block 2");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is main block");
		System.out.println(Math.PI);
		System.out.println(person.breed);
		System.out.println(Math.max(23, 234));
		System.out.println(Math.min(23, 234));
		System.out.println(Math.cbrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sin(30));
		
		System.out.println(Math.cos(30));
		System.out.println(Math.log(1) + "  " + Math.log(10));

		Teacher objT = new Teacher();
//		Student1 objS = objT.new Student1();	// To create an object of student you have to create an object of Teacher first
		
//		Student2 objS2 = new Teacher.Student2();	// In case of static we can create directly
		
		System.out.println(Teacher.Student2.x);
		
		
	}
	
	static {
		System.out.println("This is static block 3");
	}
	

}


