package Data_Structures_And_Algorithms.CollectionFrameworks.ArrayLists;

public class pair<X, Y> {	// Here I am not syaing the type of the X and Y they can be anything.
	X x;		// Here X and Y are the types it can be anything boolean, int, or something.
	Y y;
	// Let's explore the benefit of the generics
	// Here we an make our pair class(can be of any type) be more type specific means using the generics
	public pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " and " + y);
	}
}
