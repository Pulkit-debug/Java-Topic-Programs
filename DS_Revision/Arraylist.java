package DS_Revision;
import java.util.*;
public class Arraylist {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(43);
		al.add(74);
		List<Integer> newal = new ArrayList<Integer>();
		for(int i = al.size()-1; i>=0;i--) {
			newal.add(al.get(i));
		}
		System.out.println(newal);
	}
}
