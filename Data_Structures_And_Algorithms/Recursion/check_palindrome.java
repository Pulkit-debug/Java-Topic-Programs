package Data_Structures_And_Algorithms.Recursion;

public class check_palindrome {
	static boolean is_palindrome(String s, int left, int right) {
		if(left >= right) return true;
		
		if(s.charAt(left) != s.charAt(right)) return false;
		
		return is_palindrome(s, left+1, right-1);
	}
	public static void main(String[] args) {
		String s = "bbab";
		
		int left = 0;
		int right = s.length() -1;
		boolean result = is_palindrome(s, left, right);
		System.out.println(result);
	}

}
