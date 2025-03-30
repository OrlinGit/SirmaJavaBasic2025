import java.util.Scanner;

public class Task31_HalfRhombusFromAsterisks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = Integer.parseInt(sc.nextLine());
		for (int j = 1; j <= number; j++) {
			System.out.print("* ".repeat(j));
			System.out.println();
		}
		for (int i = number - 1; i >= 1; i--) {
			System.out.print("* ".repeat(i));
			System.out.println();
		}
	}
}
