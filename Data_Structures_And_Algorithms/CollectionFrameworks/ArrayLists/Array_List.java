package Data_Structures_And_Algorithms.CollectionFrameworks.ArrayLists;
import java.util.*;

//		***********Theory STuff*****************
/*		------ArrayList vs Arraay---------------
 * 
 * 	The ArrayList class is an implementation of List interface that allows us to create resizable-arrays.
 * 
 * IN java we need to declare the size of an arrray before we use it. Once the size of the array is declared then it's hard
 * to change it.
 * 
 * To handle this issue we can use the ArrayList class. The ArrayList class is present in the java.util package allows us 
 * to create resizable arrays.
 * 
 * 
 * Unlike arrays ArrayLists (objects of the ArrayList class) can automatically adjust it's capacity when we add or remove 
 * elements form it. Hence ArrayLists are known as dynamic arrays.
 * 
 * 
 * 		---------------Creating an ArrayList----------
 * 
 * ArrayList<type> arrayList = new ArrayList<>();
 * 
 * Here type indicates the type of an array list. For example: 
 * create integer arraylist 
 * ArrayList<Integer> arrayList = new ArrayList<>();
 * 
 * creating a String type ArrayList
 * ArrayList<String> arrayList = new ArrayList<>();
 * 
 * 
 */


public class Array_List {
	public static void main(String[] args) {
		
		// Creating an ArrayList
		// We can create an ArrayList like this without generics
		// Note:- We must add genrics because it helps us to be more specific
		List<String> fruits = new ArrayList<>();
		
		// In the above code we can just use the List in place of ArrayList() because it makes the interconversion easy
		// but we cannot create an object of list being an interface so the object will be of ArrayList().
		
		fruits.add("cheeku");
//		fruits.add(11);		// Here we cannot add the integer type because we just made our ArrayList type specific
		fruits.add("palak");

		
		System.out.println(fruits);
//		
//		Douzble d = 0;
//		// Now creating a function of the class pari to check Generics
//		
//		pair<String, Integer> p1 = new pair("string", 11);
//		// Here I am defining the data types on my needs it can be of any data type 
//		// I can make pair of any Data Type.
//		p1.getDescription();
//		
//		pair<Boolean, String> p2 = new pair(true, "str");
//		p2.getDescription();
		
//		*********************
//		All the name converntions like Boolean and Integer for int are stored in wrapper class because we have to use the objects as java being a object oriented language
		
//		**********Methods of the ArrayList********
		
		/*
		
		1. add(element)
		2. addAll(Collection)
		3. get(index)
		4. set(index, value)
		5. remove(index)
		6. removeAll()
		7. clear()
		8. size()
		9. contains()
		10. isEmpty()
		11. toArray()
		
		*/
		
		List<String> vegies = new ArrayList();

		vegies.add("aaloo");
		vegies.add("gajar");
				
		fruits.addAll(vegies);
		System.out.println(fruits);
		
		String indexValue = fruits.get(2);
		System.out.println(indexValue);
		
		// using set function
		
		fruits.set(2, "pyaz");
		System.out.println(fruits);
		
		// using remove
		
		fruits.remove(2);
		System.out.println(fruits);
		
		// using contains
		
		System.out.println(fruits.contains("aaloo"));
		
		// using isEmpty() 
		System.out.println(fruits.isEmpty());
		
		// using removeAll()
		fruits.removeAll(vegies);
		System.out.println(fruits);
		
		// using toArray()
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		// to check the array 
		for(String e : temp) {
			System.out.print(e + " ");
		}
		
		// using clear()
		System.out.println();
		fruits.clear();
		System.out.println(fruits.isEmpty());
		
		
		//NOTE: To sort an arrayList in rever order we can user below function
							//Collections.sort(arrayList, Collections.reverseOrder);
	}
}
