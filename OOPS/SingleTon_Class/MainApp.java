package OOPS.SingleTon_Class;

public class MainApp {

	public static void main(String[] args) {
			
		AppConfig obj = AppConfig.getInstance();
		// Now I can create as many object as I want but only one object only will be in use which is the obj that is AppConfig class is returning
		// This is the beauty of the SingleTon class because only one obj is used every time (saves memory and time)
		

	}

}
