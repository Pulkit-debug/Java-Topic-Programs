 package OOPS.SingleTon_Class;

public class AppConfig {
	
	private AppConfig()		// by making the constructor private I'm not allowing any other class to use this class constructor
	{
		
	}
	// to use the construcotr of this class one time I can create a static function which will return the obj like done below:
	
//	 private static AppConfig obj = new AppConfig();
	 
	 // If in my app i don't need this obj anywhere in that case it will just take memory for no use to solve this we can set the obj as null
	private static AppConfig obj = null;
	
	public static AppConfig getInstance()	// AppConfig is return type here becuase i have to return the obj of the class
	{
		// If at any point i need this obj then I can do like
		if(obj == null)
		{
			obj = new AppConfig();
		}
		// Another Beauty ;>
		return obj;
	}
	
	
}
