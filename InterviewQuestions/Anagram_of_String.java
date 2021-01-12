package InterviewQuestions;
import java.util.Arrays;

public class Anagram_of_String {
	public static void main(String[] arg)
	{
//		String one = "aab";
//		String two = "baa";
//		boolean check = false;
//		boolean visited[] = new boolean[two.length()];
//		if(one.length() == two.length())
//		{
//		for(int i =0;i<one.length();i++)
//		{
//			char ch = one.charAt(i);
//			check = false;
//			for(int j =0;j<two.length();j++)
//			{ 
//				if(ch == two.charAt(j) && !visited[j])
//				{
//					visited[j] = true;
//					check = true;
//					break;
//				}
//			}
//			if(!check)
//				break;
//			
//		}
//		}
//		if(!check)
//			System.out.println("Not Anagram");
//			else
//				System.out.println("Anagram");
		
		
		//simple method using sorting function
		//For that import java.util.Arrays
		
//		String a = "aba";
//		String b = "bab";
//		
//		char ar1[] = a.toCharArray();
//		char ar2[] = b.toCharArray();	//Comverting the string to char array
//		
//		Arrays.sort(ar1);	// This will do in time O(n)
//		Arrays.sort(ar2);
//		
//		String newa = new String(ar1);	// Converting the char array to new string to compare both strings
//		String newb = new String(ar2);
//		
//		if(newa.equals(newb))
//			System.out.println("Anagram");
//		else
//			System.out.println("Not Anagram");
		
		// Thid Method Good Method
		
		String a = "aba";
		String b = "bab";
		
		int arr[] = new int[256];
		int brr[] = new int[256];
		boolean check = true;
		
		for(char c : a.toCharArray())	// converting the string to char array 
		{
			int indexPosition = (int) c;	//Typecasting the value of c in int
			// c char jo hai vo har bar array ke ek position pe ja rha hai aur niche vale case me +1 karva rha hai
			arr[indexPosition]++;	// Yhan par arr ki position pe +1 ho rha hai aur ye char c ki vjah se munkin ho pa rha hai
		}
		
		for(char c : b.toCharArray())
		{
			int indexPosition = (int) c;
			brr[indexPosition]++;
		}
		
		for(int i =0;i<256;i++)
		{
			if(arr[i] != brr[i])
			{
				check = false;
				break;
				
			}
		}
		if(check)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
