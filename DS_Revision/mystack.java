package DS_Revision;

public class mystack {
	public static void main(String[] args) {
		Ll<Integer> mystack = new Ll<Integer>();
		mystack.pushOnStack(34);
		mystack.pushOnStack(56);
		mystack.pushOnStack(83);
		mystack.removeFromStack();
		mystack.print();
		System.out.println();
		mystack.peekFromStack();
	}

}
