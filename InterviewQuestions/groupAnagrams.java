package InterviewQuestions;
import java.util.*;
 public class groupAnagrams {
	 public static List<List<String>> groupAnagrams(String[] strs) {
	      Map<String, List<String>>   map = new HashMap<>();
	        for(String s : strs) {
	            char charArray[] = s.toCharArray();
	            Arrays.sort(charArray);
	            String sorted = new String(charArray);
	            
	            if(!map.containsKey(sorted)) {
	                map.put(sorted, new LinkedList<String>());
	            }
	            map.get(sorted).add(s);
	            
	        }
	        
	        return new LinkedList<>(map.values());
	    }
	 
	 public static void main(String[] args) {
		 String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		 System.out.println(groupAnagrams(str));
	 }
}
