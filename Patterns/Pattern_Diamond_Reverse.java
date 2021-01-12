package Patterns;
import java.util.*;
public class Pattern_Diamond_Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the value of n: ");
	 int n = sc.nextInt(); //all the stars with spaces
	 
	 // Loops for upper part
	 
	 for(int i = 0;i<=n/2;i++) {
		 for(int p = 0;p<n;p++) {
			 if((p >= (n/2)-i) && (p <= (n/2) + i)) {
				 System.out.print(" ");
			 } else {
				 System.out.print("*");
			 }
		 }
		 System.out.println();
	 }
	 
	 // Loops for lower part
	 
	 for(int i = 0; i<n/2;i++) {
		 for(int p=0;p<n;p++) {
			 if((p <= i) || (p >= (n-i-1))) {
				 System.out.print("*");
			 } else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
	 
	}
}
