package Stings;
import java.util. Scanner;
public class Functions_In_Strings {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String name;
//		name = sc.nextLine();
//		System.out.println(name);
//		
		// Functions in Strings
		/*	1.char charAt(int index)
		 * 
		 *  2.int length()
		 *  
		 *  3.String substring(int beginIndex) 
		 *  
		 *  4.String substring(int beginIndex, int endIndex)
		 *  
		 *  5.boolean contains(char Sequence s)
		 *  
		 *  6.boolean equals(object another)
		 *  
		 *  7.boolean isEmpty()
		 *  
		 *  8.String concat(String str)
		 *  
		 *  9.String replace(char old, char new)
		 *  
		 *  10.String[] split(string regex)
		 *  
		 *  11.int indexOf(char ch)
		 *  
		 *  12.String toLowerCase()
		 *  
		 *  13.String toUpperCase()
		 *  
		 *  14.String trim()
		 */
		//	1. char charAt(int index)
		
		name = "Pulkit";
		System.out.println("char at index -->" + name.charAt(3)); 	//Used to show the desired character from the string
		
		//	2. int length()
		
		name = "Pulkit verma";
		
		System.out.println("Length of the string -->" + name.length()); 		// Used to determine the length of the string (Spaces counts)
		
		//	3. String substring(int beginIndex);
		
		name = "Pulkit verma";
		System.out.println("Substring after the index--> " + name.substring(7)); 	//used to print the full substring after the index
		
		//	4. String substring(int beginIndex, int endIndex)
		
		name = "Pulkit verma";
		System.out.println("Substring in a given range-->" + name.substring(4, 10)); 	//used to print the substring in a given range
		
		//	5. boolean contains(char Sequence s)
		
		name = "Pulkit verma";
		System.out.println("Contains the string or not-->" + name.contains("gullu")); 	//Checks whether the string or char is present in the string
		
		//	6. boolean equals(another object)
		
		name = "Pulkit";
		String name2 = new String("Pulkit");
		System.out.println("Values are same or not--> " + name.equals(name2));	//Checks whether the value of the both strings are same or not 
		
		//	7.boolean isEmpty()
		
		name = "";
		System.out.println("String is empty or not-->" + name.isEmpty());	//Checks whether the string is empty or not
		
		//	8.String conat(String str)
		
		name = "Pulkit";
		name2 = "verma";
		System.out.println("Adding two strings-->" + name.concat(" " + name2));	 	//Used to concatinate(combine / join) two strings
		// In Java the '+' operator is overloaded and used to join two strings
		
		//	9.String replace(old char, new char)
		
		name = "Pulkit";
		System.out.println("Replace char-->" + name.replace("Pulkit", "verma"));	//Used to replace char from the string or the whole string
		
		//	10.String[] split(string regex)	regex -- regement expression
		
		String brands = "Dell,HP,Asus,Acer,Predator,Apple,Samsung";
		String allBrands[] = brands.split(",");		//Used to split the string through any value or char or string we provide in .split parenthesis
		for(String brand : allBrands)	//for each loop
		{
			System.out.println("Splitted every brand name--> " + brand);	
		}
		
		//	11.int indexOf(char ch)
		
		String Name= "Pulkit";
		System.out.println("Index of --> " + Name.indexOf('k'));	//Gives the index position of any char in the string
		
		//	12.String toLowerCase()
		String UpperName = "PULKIT";
		System.out.println("Lower_Case--> " + UpperName.toLowerCase());		//Used to convert any string to lower case letters
		
		//13. String toUpperCase()
		String LowerCase = "pulkit";
		System.out.println("Upper_CAse--> " + LowerCase.toUpperCase()); 	//Used to convert any string to upper case letters
		
		//14. String trim()
		String UsingTrim = "      Pulkit    ";
		System.out.println("Removed Spaces--> " + UsingTrim.trim());	//Used to remove pre and post spaces in a string
	}
}
