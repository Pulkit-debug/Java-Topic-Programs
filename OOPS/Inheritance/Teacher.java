package OOPS.Inheritance;

public class Teacher extends Person{
	
	// This is a child class of Person (parent class) 
	


	/* Teacher extends person -> Teacher is the child class (child class must always be in the left portion
	 * 
	 * extends -> this is used to represent the relation of child and parent class 
	 * 
	 * Person -> Person is the parent class (always written in the right portion of <u> extends </u>
	 * 
	 * */
	public Teacher(String name)	// Constructor of teacher
	{
		super(name);	// This will go to the parent class constructor 
		System.out.println("Inside the Teacher Constructor");
	}
	
	
	public void teach()
	{
		System.out.println(name + " can Teach");
	}
	
	public void eat()	// If the same method(function) is overrideed the child will override the parent method (child is the master of his own)
	// We are defining the properties on children level
	{
		super.eat();	// Super keyword is referring the immediate parent class and going to person to the eat method.
		System.out.println("Teacher " + name + " can Eat");
	}
}
