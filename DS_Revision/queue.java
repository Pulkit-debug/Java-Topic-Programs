package DS_Revision;

public class queue {
	public static void main(String[] args) {
		Ll<Integer> q = new Ll<Integer>();
		q.pushen(43);
		q.pushen(52);
		q.pushen(65);
		q.print();
		System.out.println();
		q.popd();
		q.print();
		System.out.println();
		q.peekq();
		
	}
}
