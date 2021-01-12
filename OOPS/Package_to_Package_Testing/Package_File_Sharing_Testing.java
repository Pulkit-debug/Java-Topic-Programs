package OOPS.Package_to_Package_Testing;

import OOPS.Packages.*;
// The meaning of star is that in the packages package i want all the files (not only one all the files)
// And from all the files i can use whatever file i want	(Beauty of * :D)
public class Package_File_Sharing_Testing {
	public static void main(String[] args)
	{
	Student stu = new Student("Pulkit");
//	System.out.println("Again printing name : " + obj.name); 	In student class the name is private so this class can't access the name
//	We can change the name in student class from private to public then we can only access the name in this class
	
	Teacher tea = new Teacher();
	}


}
