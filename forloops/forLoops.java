package forloops;
import java.util.Scanner;
public class forLoops 
{
	 public static void main(String[] args ) {
		 Scanner sc = new Scanner(System.in);
//	 for ( int i = 0; i <=50; i = i + 1) {
		 
//		System.out.println("Hello" + " " + i); 
		 
//	 }	 	

		 
		 // To find the sum of n numbers 
		 
//		 int sum = 0;
//		 int n = 50;
//		 for (int i = 1; i <=  n; i++) {
//			 sum = sum + i;
//	 }
//	 	System.out.println(" This is the sum of the numbers: " + sum );
		 
		 //Suppose for the reverse loop
//		 System.out.println("Enter your number : ");
//		 int n = sc.nextInt();
//		 for (int i = n; i >= 1; --i )
//		 {
//			 
//			 System.out.println(i);
//		 }
		 
		 // To print  table
		 
		 System.out.println("Enter your number : ");
		 int tableOf = sc.nextInt();
		 int multiply = 0;
		 for (int i = 0; i <= 10; i++)
		 {
			 multiply = tableOf * i;
			System.out.println(tableOf + " " + "x" + " " + i + " "  + "=" + " " + multiply );
			 
		 }
			 
		 
	 }
}