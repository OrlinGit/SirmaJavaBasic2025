import java.util.Scanner;

public class Task04_Calculator {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter command:");
		String command = sc.nextLine();
		System.out.println("Enter first number:");
		int firstNumber = Integer.parseInt(sc.nextLine());
		System.out.println("Enter second number:");
		int secondNumber = Integer.parseInt(sc.nextLine());
		// това също може да бъде изкарано в метод
		switch (command){
			case "add":
				System.out.println(add(firstNumber, secondNumber));
				break;
			case "subtract":
				System.out.println(subtract(firstNumber, secondNumber));
				break;
			case "multiply":
				System.out.println(multiply(firstNumber, secondNumber));
			case "divide":
				System.out.println(divide(firstNumber, secondNumber));
				break;
		}
	}
	public static int add(int firstNumberInput, int secondNumberInput){
		return firstNumberInput + secondNumberInput;
	}
	public  static  int subtract(int firstNumberInput, int secondNumberInput){
		return  firstNumberInput - secondNumberInput;
	}
	public  static int multiply(int firstNumberInput, int secondNumberInput){
		return firstNumberInput * secondNumberInput;
	}
	public static int divide(int firstNumberInput, int secondNumberInput){
		return firstNumberInput / secondNumberInput;
	}
}
