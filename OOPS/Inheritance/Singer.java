package OOPS.Inheritance;

public class Singer extends Person{
	
	// This is a child class of person (Parent class)
	
	public Singer(String name) {
		super(name);
		System.out.println("Inside the Singer constructor");
	}

	public void sing()
	{
		System.out.println(name + " can sing a song");
	}
	
	public void eat()	// Here also method overriding
	{
		System.out.println("Singer " + name + " can Eat");
	}
}
