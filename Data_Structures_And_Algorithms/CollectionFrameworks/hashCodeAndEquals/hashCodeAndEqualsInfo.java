package Data_Structures_And_Algorithms.CollectionFrameworks.hashCodeAndEquals;

public class hashCodeAndEqualsInfo {
	
	
	// *************************** HashCode and Equals Method  *****************************
	
	// hashCode() and equals() method have been defined in Ojbect class which is parent class for java objects. For this reason
	// all java objects inherit a default implimentaion of these methods
	
	
	
//	Java hashCode()																	java equals()
//	
//	-Ojbect class defined method like this.							-Object class defined equals() method like this.
//	
//	public int hashCode() {												public int equals(Object obj) { 
//		
//		 TODO return the hashCode;										return (this == obj);
//	}																		}
//	
	
	
	//************************ The Contract of hashCode() and equals() *******************
	
//	- The contract between hashCode() and equals() is:
	
//		1. If two objects are equal then they must have same hashCode.
//		
//		2. If two objects have the same hashCode then they may or may not be euqal.
//	
	
	
	//********************** Best Practices **************************
	
//	1. Always use same attributes of an object to generate hashCode() and euqals() both.
//	
//	2. equals() must be consistent (if the objects are not modified then it must keep returning the same value)
//	
//	3. Whenever a.equals(b) then a.hashCode() must be equals to b.hashCode()
//	
//	4. If your override one then you must override other too.
//	
	
	
	
	
}
