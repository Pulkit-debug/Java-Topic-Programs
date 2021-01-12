package Data_Structures_And_Algorithms.CollectionFrameworks.HashMap;
import java.util.*;
import java.util.Map.Entry;
public class hashMapMain {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("tom", 70);
		map.put("jerry", 90);
		map.put("bull", 50);
		System.out.println(map.get("tom"));
		map.putIfAbsent("human", 95);
		System.out.println(map.get("tom"));
		System.out.println(map.containsKey("jerry"));
		System.out.println(map.containsValue(34));
		System.out.println(map);
		map.replace("human", 100);
		map.replace("bull", 50, 55);
		map.remove("human");
		System.out.println(map);
		map.remove("bull", 55);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		// suppose we have to iterate over the entries
		
		Set<Entry<String, Integer>> entry = map.entrySet();
		
		for(Entry<String, Integer> entries : entry) {
			entries.setValue(entries.getValue() * 100) ;	
		}
		
		System.out.println(map);
		
		}
}
