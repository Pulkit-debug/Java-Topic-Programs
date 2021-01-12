package NestedForLoops;
import java.util.Scanner;
public class TableFrom1To20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int j = 1; j <=20; j++)
		{
			int n = j;
		for (int i = 1; i <=10; i++)
		{
			System.out.print(n *i + " ");
				
		}
		System.out.println();
		}

	}

}
