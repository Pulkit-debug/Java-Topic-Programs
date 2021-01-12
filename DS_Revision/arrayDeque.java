package DS_Revision;

public class arrayDeque {
	public static void main(String[] args) {
		Ll<Integer> ad = new Ll<Integer>();
		ad.offerFirst(34);
		ad.offerLast(45);
		ad.offerLast(76);
		ad.offerFirst(23);
		
		ad.print();
		
		System.out.println();
		
		ad.peekFirst();
		ad.peekLast();
		
		ad.pollFirst();
		ad.pollLast();
		ad.print();
		
	}
}
