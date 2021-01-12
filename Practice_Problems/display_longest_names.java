package Practice_Problems;
import java.util.*;
public class display_longest_names {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j = 0;j<t;j++)
		{
			int n = sc.nextInt();
			String a[] = new String[n] ;	// String array
			int len = a.length;
			System.out.println(len);
			sc.nextLine();		//	Because we cannot just create an string right after an int it will take one less value
			int large=Integer.MIN_VALUE;
			String max = new String();
			for(int i =0;i<len;i++) {
				a[i] = sc.nextLine();
			
				if(large < a[i].length())
				{
					large = a[i].length();
					max = a[i];
				}
			}
			System.out.println("the length of the largest array is : " + large);
			
			System.out.println("The largfest element is : " +  max);
//			String check = new String();
//			for(String x : a)
//				System.out.print(x + " ");
//			for(int i =0;i<a.length;i++) {
//				char c = a[i];
//				if(a[i].length() > )
//			}
			
		}

	}

}
