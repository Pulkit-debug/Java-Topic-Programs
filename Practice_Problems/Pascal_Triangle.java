package Practice_Problems;
import java.util.*;
public class Pascal_Triangle {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the of rows : ");
	    int n = sc.nextInt();
	    int num =1;
	    for(int i = 1;i<=n;i++)
	    	{ 
	    		System.out.print(num + " ");
	    		num = (num * (n-i))/i;
	
	    }
	}

}
