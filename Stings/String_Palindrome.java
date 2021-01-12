package Stings;
import java.util.*;
public class String_Palindrome {
	public static void main(String[] args)
	{
		
		// Code for prevailing and derailing spaces
		
		// Original code
//		
//		String s = "     The sky     is    blue      ";
//		String word = "";
//		int i =s.length()-1;
//		
//		while(i >= 0)
//		{
//			
//			while(i>=0 && s.charAt(i) == ' ')
//			i--;
//			
//			int j =i;
//			
//			if(i < 0)
//				break;
//			
//			while(i>=0 && s.charAt(i) != ' ')
//				i--;
//			
//			if(s.isEmpty())
//				word = word.concat(s.substring(i+1, j+1));
//			else
//				word = word.concat(" " +s.substring(i+1, j+1));
//			
//		}
//		
//		System.out.println(word);
		
		// Method to print without spaces (shortest)
		
		String s = "     The   sky       is       blue   ";
		String arr[] = s.split(" ");
		
		for(int i =arr.length-1;i>=0;i--)
		{
			s.trim();
			
		}
		for(int i =arr.length-1;i>=0;i--)
			System.out.print(arr[i] );
		
	
	}
}
