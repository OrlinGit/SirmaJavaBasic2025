import java.util.Scanner;

public class Task32_RhombusFromAsterisks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int size = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= size; i++) {
			System.out.print(" ".repeat(size - i) + "*");
			System.out.print(" *".repeat(i - 1));
			System.out.println();
		}

		for (int i = size - 1; i >= 1; i--) {
			System.out.print(" ".repeat(size - i) + "*");
			System.out.print(" *".repeat(i - 1));
			System.out.println();
		}

	}

}
