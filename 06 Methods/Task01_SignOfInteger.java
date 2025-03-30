import java.util.Scanner;
public class Task01_SignOfInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = Integer.parseInt(sc.nextLine());

		printSignOfNumber(number);

		}
	public static void printSignOfNumber(int inputNumber){
		if (inputNumber == 0){
			System.out.println("The number 0 is zero.");
		} else if (inputNumber < 0) {
			System.out.printf("The number %d is negative.", inputNumber);
		} else {
			System.out.printf("The number %d is positive.", inputNumber);
		}
	}
}
