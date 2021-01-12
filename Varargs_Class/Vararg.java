package Varargs_Class;

public class Vararg {
	
	public static void main(String[] args)
	{
		int n = 0 ;
		display d = new display();
		d.show(6, 4, 2, 6);
		
	}
	
}

class display
{
	// By applying these three dots we are passing an array . This is another form to write like an array.(can be a bit convinient)
	public void show(int ... x)
	{
		System.out.println(x);
	}
}
