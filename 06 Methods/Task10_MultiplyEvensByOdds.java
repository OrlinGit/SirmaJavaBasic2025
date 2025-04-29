import java.util.Scanner;

public class Task10_MultiplyEvensByOdds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int input = Integer.parseInt(sc.nextLine());
		result(input);
	}

	public static int sumOdd(int inputNum) {
		int sumOdd = 0;
		while (inputNum != 0) {
			int currentNum = inputNum % 10;
			if (currentNum % 2 != 0) {
				sumOdd += currentNum;
			}
			inputNum /= 10;
		}
		return sumOdd;
	}

	public static int sumEven(int inputNum) {
		int sumEven = 0;
		while (inputNum != 0) {
			int currentNum = inputNum % 10;
			if (currentNum % 2 == 0) {
				sumEven += currentNum;
			}
			inputNum /= 10;
		}
		return sumEven;
	}

	public static void result(int inputUser){
		int odd = sumOdd(inputUser);
		int even = sumEven(inputUser);
		int result = odd * even;
		System.out.println(result);
	}

}
