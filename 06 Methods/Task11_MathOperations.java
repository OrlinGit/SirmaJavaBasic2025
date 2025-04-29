import java.util.Scanner;

public class Task11_MathOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNum = Double.parseDouble(sc.nextLine());
		System.out.println("Enter operator: ");
		char operator = sc.nextLine().charAt(0);
		System.out.println("Enter second number: ");
		double secondNum = Double.parseDouble(sc.nextLine());
		result(firstNum, secondNum, operator);
	}

	public static double sum(double numOne, double numTwo) {
		double result = numOne + numTwo;
		return result;
	}

	public static double multiplication(double multiplierOne, double multiplierTwo) {
		double result = multiplierOne * multiplierTwo;
		return result;
	}

	public static double difference(double numOne, double numTwo) {
		double result = numOne - numTwo;
		return result;
	}

	public static double division(double divisible, double divider) {
		double result = divisible / divider;
		return result;
	}

	public static void result(double firstNum, double secondNum, char operation) {
		switch (operation){
			case '*':
				System.out.println(multiplication(firstNum, secondNum));
				break;
			case '+':
				System.out.println(sum(firstNum, secondNum));
				break;
			case '-':
				System.out.println(division(firstNum, secondNum));
				break;
			case '/':
				System.out.println(division(firstNum, secondNum));
				break;
		}

	}
}
