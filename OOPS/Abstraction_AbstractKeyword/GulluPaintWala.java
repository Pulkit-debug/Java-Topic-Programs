package OOPS.Abstraction_AbstractKeyword;

public class GulluPaintWala {

	public static void paint(car Car)
	{
		System.out.println("Car is Painted");
	}
	
	
	public static void main(String[] args) {
		// Gullu sirf grey paint karta hai with Matt Finish
		Bugati bugati = new Bugati();
		lambo lamo = new lambo();
		
		paint(bugati);
		paint(lamo);
		
	}

}
