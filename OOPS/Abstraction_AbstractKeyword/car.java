package OOPS.Abstraction_AbstractKeyword;

public abstract class car {
	// Abstract is used when we do not want to implement the method instead the child class will implement or change it.
	// Abstract is used when only child class is present 
	// We cannot make the object of an abstract class.
	// To make functions abstract we have to also make the class abstract.
	public abstract void accelarate();	
	// there is not point in implementing these methods here because a car can be of any type.
	
	public abstract void superBrakes();

	// we make non abstract type methods in the abstract class. And these are called "Concerete Methods". 
	public void honk()	
	{
		System.out.println("Car is honking");
	}
	
}
