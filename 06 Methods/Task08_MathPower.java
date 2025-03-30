import java.util.Scanner;

public class Task08_MathPower {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double number = Double.parseDouble(sc.nextLine());
		System.out.println("Enter power:");
		int power = Integer.parseInt(sc.nextLine());
		System.out.println(calculatePower(number, power));
	}
	public static double calculatePower(double numberInput, int powerInput){
		double result = numberInput;
		for (int i = 1; i < powerInput; i++) {
			result *= numberInput;
		}
		return result;
	}
}
