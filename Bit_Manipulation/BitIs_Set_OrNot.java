package Bit_Manipulation;
import java.util.*;
public class BitIs_Set_OrNot {
	 static void checkSet(int n, int pos)
	{
		if((n & (1 << (pos))) != 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
//	
	public static void main(String[] args) {
		// Check if the ith bit is set in the binary number or not
		int n = 23;
		int pos = 4;
//		System.out.println(checkSet(n, pos));
		checkSet(n, pos);
	}

}
