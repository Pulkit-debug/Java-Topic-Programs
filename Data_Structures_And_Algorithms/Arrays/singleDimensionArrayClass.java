package Data_Structures_And_Algorithms.Arrays;
//import node.SingleNode;?
public class singleDimensionArrayClass {
	int arr[] = null;
	// Initialising the whole array with MIN_VALUE
	// Constructor
	public singleDimensionArrayClass(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	// Accessing the elements of the arary:
	
	public void traverseArray() {
		try {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		} catch (Exception e) {
			System.out.println("Array is no longer exists");
		}
	}
	
	// Insertion of the elements in the array
//	System.out.println("Inserting Elements in the array");	
	public void insert(int index, int value) {
		try {
			
		if(arr[index] == Integer.MIN_VALUE) {
			arr[index] = value;
			System.out.println("Successfully inserted " + value + " at Index " + index);
		}
		else
			System.out.println("Sorry!, The cell is already occupied");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Index is not valid");
		}
	}
			
			
}
