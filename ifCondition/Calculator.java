package ifCondition;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number : ");
		float a  = sc.nextFloat();
		
		System.out.println("Enter your second number : ");
		float b = sc.nextFloat();
		
		System.out.println("Enter your operation : ");
		//Hum character ke andar directly input nhi le sakte Scanner ke andar
		//Integer ka input lene ke bad directly string ka input nhi le sakte ek string alag se leni padti hai lene ke liye
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		float result = 0;
	switch(operation) {
	
	case '+':
		result = a + b;
		break;
	case '-':
		result = a - b;
		break;
	case '*':
		result = a * b;
		break;
	case '/':
		result = a / b;
		break;
	
	}
	System.out.println("Your answer is : " + result);
	
	
		
	}
}
