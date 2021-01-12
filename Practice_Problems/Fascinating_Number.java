package Practice_Problems;
import java.util.*;
public class Fascinating_Number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j<t;j++)
		{
		    int n = sc.nextInt();
		    int len = (int )(Math.log10(n)) +1;		//Calculating the number of digits in the number
		    if(len >= 3)
		    {
		    int ntemp = n;
		    int temptwo = n*2;	
		    int tempthree = n*3;
		    String s1 = Integer.toString(ntemp);			// Converting all the three numbers into string to concat them
		    String s2 = Integer.toString(temptwo);
		    String s3 = Integer.toString(tempthree);
		    String s4 = s1 + s2 + s3;
//		    int a = Integer.valueOf(s4);
		    
		    int arr[] = new int[s4.length()];	// Array to store all the values of the concated string(int)
		    for(int i =0;i<s4.length();i++)
		    {
		    	arr[i] = s4.charAt(i) - '0';
		    }
		    
		    for(int x : arr)
		    	System.out.print(x + " ");
//		    System.out.println(a);
		    System.out.println();
		    Arrays.sort(arr);
		    for(int x : arr)
		    	System.out.print(x);
		    System.out.println();
		    int check =0;
		    for(int y : arr)
		    	check = check*10 + y;
		    	
		    System.out.println(check);
		    
		    if(check == 123456789)
		    	System.out.println("Fascinating");
		    else
		    	System.out.println("Not Fascinating");
		    }
		    else
		    	System.out.println("Number must be atleast three digits");
		}
	}
}
