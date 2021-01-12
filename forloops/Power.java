package forloops;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		
		// Find x raised to power y
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your first number : ");
			int a  = sc.nextInt();
			System.out.print("Enter your second number : ");
			int b= sc.nextInt();
			int power = 1;
			for (int i = 0; i < a; i++)
			{
				power *=  b;
			
			}
			System.out.println(power);
		
		
	}

}
