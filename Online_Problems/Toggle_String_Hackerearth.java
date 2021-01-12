package Online_Problems;
import java.util.Scanner;
import java.util.Arrays;
//import java.util.Characters;
public class Toggle_String_Hackerearth {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] arr = s.toCharArray();	// Here we are converting the string to char array 
		//Now we apply for each loop just for the convinence 
		for(char ch: arr)
		  {
			// By using the character we are taking the characters one by one and checking them if upper or lower and changing them
		if(Character.isUpperCase(ch)){
		ch= Character.toLowerCase(ch);
		}
		else if(Character.isLowerCase(ch)){
		    ch= Character.toUpperCase(ch);
		}
	}
	}}
