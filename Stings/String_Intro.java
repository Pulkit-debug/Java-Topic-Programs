package Stings;

public class String_Intro {
	public static void main(String[] arg)
	{
		// Sting is a not primitive datatype (Derived by primitive datatype)
		//There is a seperate class made for strings in java
		//Classes in Java are used as a Datatype.
		String name = "Pulkit";
		String name2 = "Pulkit";	// This is called Strings by literals
		String namenew = "mearname";
		
		// Strings are immutable (Cannot be changed)  :( 
		
		namenew = "meradusraname";
		String anotherName = new String("Pulkit");	//This is called Srings by object
		
		// There is a huge(important) differnce between the above two types of initialisation
		/*
		 There is a special memory defined for the string to store called as "String pool Area/memory"
		 in this memory every string initialised by literals go
		 
		 working of pool area : Initialisation by literals 
		 :-----If There is already a string present in the pool area similar to the initialised string, then it won't create a new string rather it will provide the already present string to the initialised vairable
		 :    In this way we can preserve some space in the memory leading to a bit of optimisation
		 
		 
		 working of pool area and heap area : Initialisation by new String("name")
		 :------ It will create a new string everytime in heap area and will check in the pool area if the string is already present if "Yes" then it will refer the already present string to the new initialised string
		 The rest working in the pool area is same as the Working of Initialisation by literals
		 
		  */
		
		
		System.out.println(name ==name2);
		System.out.println(namenew);
		
	}
}
