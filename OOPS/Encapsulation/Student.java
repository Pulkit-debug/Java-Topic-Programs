package OOPS.Encapsulation;

public class Student {
	
	private int age;
	private String name;
	
	//Here the details of the student are private but the main function wants the details anyway so ,
	// We have a concept of getters and setters method.
	
	public int getAge() {
		// To get the age
		return age;
	}
	
	public String getName() {
		// To set the age
		return name;
	}

	public void setName(String name) {
		if(name == name.toLowerCase())	// Here we have applied restrictions
		{
			System.out.println("You must write every word in upper case letters");
		}
		else
		{
		this.name = name;
		}
	}

	public void setAge(int age)
	{
		if(age > 20)	// Here we have applied restrictions for the age that it can't be greater than 20
			System.out.println("Not suitable for the school");
		else
			this.age = age;
	}
	
}
