package OOPS;

class Vehicle
{
	int wheels;
	
	Vehicle()	//Non-parametrised/No-argument constructor
	{
		wheels = 4;
		System.out.println("Wheels of car are : " + wheels); 
		
	}
}

class VehicleNew
{
	int wheels;
	
	VehicleNew(int wheels)	// This is a Parameterised Constructor
	{
		//If we want to keep the name of the variables same the can keep them and we can seperate them by using a keyword "this."
		//this. keyword is seperating the class variable to the parameter(variable) of the constructor
		this.wheels = wheels;	
	}
	
	// We can also do Constructor overloading by just changing the parameters 
	// NOTE :-  We cannot create a default constructor if we already created a constructor instead we can create a empty constructor (will work like default)
	}

public class MyConstructor {
	
	MyConstructor()	// Whenever an object of a class is created constructor is always called
	{
		System.out.println("MyConstructor is called");
	}
	
	public static void main(String[] args)
	{
			// 		--------CONSTRUCTORS-----------	
		
		/*Constructor	- 	A Constructor is similar to a method(but not actually a method) that is invoked automatically when an object is instantiated (created)
		 *  -> A constructor is always called when a object of a class is made and it provides garbage value to the variables (if any)
		 * class Test{
		 * 		Test()	{	// Constructor is always in the name of class
		 *			constructor Body 
		 * }
		 * */
		MyConstructor cons = new MyConstructor();	//By making this we are calling a constructor
		Vehicle car = new Vehicle();
		VehicleNew bike = new VehicleNew(2);		// giving a value (Parameterised)
		
		System.out.println("Wheels of bike are : "  + bike.wheels);
		
	}
}
