package OOPS.Inheritance;

public class main_Inheritance {

	public static void main(String[] args) {
		// Details in child and parent class
		// Person is a parent class
		// Teacher is a child class
		// Singer is a child class
		
		
		Teacher t = new Teacher("Pulkit");
		Singer s = new Singer("Tiklup");
//		System.out.println("Details about the Teacher");
//		System.out.println(t.name = " Pulkit");
////		t.walk();
//		t.eat();
//		t.teach();
//		System.out.println();
//		
//		System.out.println("Details about the Singer");
//		Singer s = new Singer();
//		System.out.println(s.name = "Tiklup");
//		s.eat();
////		s.walk();
//		s.sing();
		
		//  					------------Method Overriding-------
		/*	What happens if the same method is defined in both the superclass and subclass i.e (Parent class and  child class)
		 * 
		 * Well in that case the method in the subclass overrides the superclass ( children aquire its own path (Properties)
		 * 
		 * */
	
		// Super Keyword -> in java super keyword is used to refer to the immediate parent class of a child class. In other words super keyword is used by a subclass whenever it needs to refer to its immediate super class		
		
//		t.name = "Pulkit";
		
//		t.eat();	
		// Here first we go to the Teacher class in it we go to function eat and then super keyword takes us to the person (Parent class)
		// And there the the eat methnod is executed and then the eat method of teachre stops after it ends.
	}

}
