package OOPS.Abstraction_AbstractKeyword;

public class Bugati extends car {
	
	// Properties 
	public void accelarate()
	{
		System.out.println("Bugati is accelarating");
	}
	
	

	@Override	//<--- This is a anotation
	// @Override means that we are saying that the method is supposed to be overridden
	public void superBrakes() {
		// TODO Auto-generated method stub
		
	}

}
