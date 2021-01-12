package courseProblems;

public class reverseStringWordByWord {

	public static void main(String[] args) {
		String str = "   The     sky is Blue    ";
		str = str.trim();
		// expected output : "Blue is sky The"
		char a[] = str.toCharArray();
		str = str.replaceAll("\\s+", " ");
		
		
		String[] strWords = str.split(" ");
		String rev[] = new String[strWords.length];
		for(int i = 0;i<strWords.length;i++) {
			System.out.println(strWords[i]);
		}
		int j = 0;
		for(int i = strWords.length-1;i>=0;i--) {
			rev[j] = strWords[i];
			j++;
		}
		
		//printing reversed  string
		int wordCount = 0;
//		String lastWord = "";
//		str = str.replaceAll("\\s", "");
		for(int i = 0;i<rev.length;i++) {
			if(wordCount == rev.length-1) {
				System.out.print(rev[i]);
			}
			else {
			System.out.print(rev[i] + " ");
			}
			wordCount++;
		}
		
		
	}
}
