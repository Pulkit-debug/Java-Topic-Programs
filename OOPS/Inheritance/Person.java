package OOPS.Inheritance;

public class Person {

	protected String name;	// We are using protected here so that the name (variable) can only be visible to child classes and not to others
	// This is the parent class
	
	// A parent class can have multiple child classes But a child class cannot have multiple parent classes
	
	public Person( String name)		// constructor of Person (parent class)
	{
		this.name = name;
		System.out.println("Inside the Person constructor");
	} 	
	
	public void walk()
	{
		System.out.println("Person" + name + " can Walk");
	}
	
	public void eat()	// Super keyword is coming here
	{
		System.out.println("Person " + name + " can Eat");
	}
	
}
