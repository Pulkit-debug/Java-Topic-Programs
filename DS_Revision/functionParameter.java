package DS_Revision;

public class functionParameter {
	public static void main(String[] args) {
//		int a = 5;
//		int b = 3;
//		System.out.println(a + " " + b);
//		swap(a, b);
//		System.out.println(a + " " + b);
		boy a = new boy();
		a.maths = 45;
		boy b = new boy();
		b.maths = 50;
		System.out.println(a.maths + " " + b.maths);
		swap(a, b);
		System.out.println(a.maths + " " + b.maths);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
	}
	static void swap(int c, int d) { // Here am passing primitive datatype so what we are seeing is pass by value
		int temp = c;
		c = d;
		d = temp;
	}
	static void swap(boy m, boy c) { // Here am passing non-prmititve so here we are seeing is pass by referrence
		boy temp = m; 
		m = c;
		c  = temp;
	}
	
}

class boy {
	int maths;
}
