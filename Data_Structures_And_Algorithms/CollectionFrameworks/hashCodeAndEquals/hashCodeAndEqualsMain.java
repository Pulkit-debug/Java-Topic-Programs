package Data_Structures_And_Algorithms.CollectionFrameworks.hashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

public class hashCodeAndEqualsMain {

	public static void main(String[] args) {
		
		Cartoon cart = new Cartoon(10, "benten");
		Cartoon cart2 = new Cartoon(10, "benten");
		
		System.out.println(cart);	 
		System.out.println(cart2);
		
		System.out.println(cart.equals(cart2));
		
		Set<Cartoon> set = new HashSet<Cartoon>();
		set.add(cart);
		set.add(cart2);
		System.out.println(set);
		
	}
	
}

class Cartoon {
	int number;
	String name;
	
	public Cartoon(int number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartoon other = (Cartoon) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Cartoon that = (Cartoon) obj;
//		boolean isEqual = this.number == that.number && this.name.equals(that.name);
//		return isEqual;
//	}
//	// if we override one function either equals or hashcode then we have to override other function too 
//	
//	@Override
//	public int hashCode() {
//		return number + name.hashCode();
//	}
	
	
	
}

