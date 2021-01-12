package arrays;
import java.util.Scanner;
public class ToFindAverageOfStudentsInClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of students : ");
	int n = sc.nextInt();
	
	int[] marks = new int[n];
	
	System.out.print("Now Enter the marks one by one : ");
	for(int i = 0; i<n; i++) {
		
		marks[i] = sc.nextInt();
		
	}
	
	int averageMarks = 0;
	for (int i = 0;i<n;i++) {
		
		averageMarks += marks[i];
	}
		averageMarks /= n;
	System.out.print("Your averageMarks are : " + averageMarks);
	}
}
