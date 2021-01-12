package OOPS.Encapsulation;

public class Encapsulation_main {

	public static void main(String[] args) {
		
		Student st = new Student();		//Obj of the class
		
		st.setAge(3);
		
		System.out.println(st.getAge());
		st.setName("pulkit");		
				
		System.out.println(st.getName());
	}

}
