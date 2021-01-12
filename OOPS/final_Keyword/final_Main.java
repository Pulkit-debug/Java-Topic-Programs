package OOPS.final_Keyword;

// final is basically to make something final means it cannot be changed again anywhere.

public class final_Main /* extends final_Studen */ {		// Here we cannot extend the final student in this class 
	
	// ********Overriding the getDescription method***************
	
	
	
//	public void getDescription() {
//		System.out.println("Overriding the final method of the student");
//	}
//	
	public static void main(String[] args)
	{
		final String MY_NAME = "Pulkit";
		// Now after declaring the final keyword to the String name we cannot  modify the name again as it is not final.
		// It is a good convention to follow caps letters while using final keyword(useful).
		// You must initialise a final variable it is mandatory. You cannot leave them empty.
		System.out.println(MY_NAME);
	
		
		final final_Student obj = new final_Student();
		final_Student obj2 = new final_Student();
		//obj = obj2; // It is valid here
		
		// But if we make the objs final then we cannot change the referrence of that object to another object  whereas we can still change the inner variables of the object.
		System.out.println(obj.rollno);
		
		
		
		final_Main main = new final_Main();
		
		// Whenever we create a method as final we cannot override that method again .
		obj.getDescription();
		
		
		// Same as for the class 
		// If we use final in any class means that we cannot make anymore children classes of that final class
		// You cannot extend that final class anymore.
		
	}
}
