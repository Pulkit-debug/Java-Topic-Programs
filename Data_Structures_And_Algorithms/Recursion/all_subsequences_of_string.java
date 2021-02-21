package Data_Structures_And_Algorithms.Recursion;

public class all_subsequences_of_string {

	static void print_subSeq(String s, int i, String current) {
		if(i == s.length()) {
			System.out.println(current);
			return;
		}
		
		
		// either you include it or you don't include it.
	print_subSeq(s, i+1, current + s.charAt(i));
	print_subSeq(s, i+1, current);
	}
	
	public static void main(String[] args) {
		
		
		String s = "abc";
		
		String current = "";
		print_subSeq(s, 0, current);

	}

}
