package OOPS;

class laptop {
	int price;
	String name, processor;
	boolean mattFinish;
	
	public void start()
	{
		System.out.println("Laptop is Starting");
	}
	
	public void shutDown()
	{
		System.out.println("Laptop is shutting down");
	}
	
	public void details()
	{
		System.out.println("The name of the laptop is " + name + " and it has a " + processor + " Processor");
		System.out.println("My laptop price is " + price + "rs.");
	}
	
}

public class Class_And_Objects {	// There can only be one main public class in a program

	public static void main(String[] args)
	{
		
		// 			----------Objects--------
		/* 1. Objects have some state and behavior
		 * 2. An object can be defined as instance of a class
		 * 3. An object contains an address and takes up some space in memory
		 * 
		 * eg. a white board, a blue pen , a mac laptop etc
		 * 
		 * In the above example board is a class and white board is a object of the class (same for pen and laptop)
		 * 
		 * */
		
		
		// 				--------CLASSES---------
		/*1. A class is a blue print for the object
		 * 2. It is a logical entity (Means it is not present in real any where it is just there )
		 * 3.Classes doesn't consume any space 
		 * 4. We can create many objects form a class (as described in the above example of objects)
		 * 
		 * eg. pen class , laptop class
		 * */
		
		laptop laptop1 = new laptop();
		laptop1.start();		// Here we are changing the behavior of the object
		//	IN java we create methods not functions	 ( both are same just name is changed )
		laptop laptop2 = new laptop();
		laptop2.name = "Apple";		// Accessong the porperties of the class in above we were accessing the behavior
		laptop2.processor = "Intel";
		laptop2.price = 50;
		laptop2.details();
		
		
	}
}
