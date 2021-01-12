package Practice_Problems;
import java.util.*;
public class Strings_Equalisation_Code_Forces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		while(test-->0)		// Test Cases
		{
		
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		s = s.toLowerCase();
		t = t.toLowerCase();
		
		int flag =0;
		
		if(s == t)	// If already equal
			
			System.out.println("YES");
		else
		{
			char[] news = s.toCharArray();
			char[] newt = t.toCharArray();
			if(news.length == newt.length)			// news and newt are sorted s and t
			{
		
		Arrays.sort(news);
		Arrays.sort(newt);	// Sorting the arrays
		
//		System.out.println("Sorted arrays are : ");
//		for(char x :  news)			
//			System.out.print(x + " ");
//		System.out.println();
//		for(char x : newt)
//			System.out.print(x + " ");
		
		char ch;
		
		// If any element if found in any of the string the string can be equalised. (Easy Peasy)
		
		for(int i =0;i<news.length;i++)
		{
			char check = news[i];
			for(int j =0;j<newt.length;j++)
			{
				if(check == newt[j])
				{
//					 ch = news[i];
					 flag =0;
					break;
				}
				else
					flag = 1;
				
			}
			if(flag ==0)
				break;
		}
		
		if(flag ==0)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
		
		
//			for(int i =0;i<news.length;i++)
//			{
//				if(news[i] != newt[i])
//				{
//					char check = newt[i];
//
//					
//					for(char x : news) 
//					{
//						if(x == check)
//						{
//							news[i] = x;
//							break;
//						}
//					}
//					
//				}
//			}
//			for(int j =0;j<newt.length;j++)
//			{
//				 if(newt[j] != news[j])
//				{
//					char check = news[j];
//					
//					
//					for(char x : newt) 
//					{
//						if(x == check)
//						{
//							newt[j] = x;
//							break;
//						}
//					}
//				}
//
//			}
		
		
//		System.out.println();
//		System.out.println("After swaping of characters : ");
//		
//		for(char x : news)
//			System.out.print(x  + " ");
//		System.out.println();
//		for(char x : newt)
//			System.out.print(x  + " ");
//		
		
//		String news1 = new String(news);
//		String newt1 = new String(newt);
		
//		for(int i =0;i<news.length;i++)
//		{
//		
//		if(news[i] == newt[i])
//		flag = 0;
//		else
//			flag =1;
//		}
////		System.out.println();
//	if(flag ==0)
//		System.out.println("YES");
//	else
//		System.out.println("NO");
//		}
//			
//			else
//				System.out.println("NO");
//	}
	}
	}
		}
	}
}
