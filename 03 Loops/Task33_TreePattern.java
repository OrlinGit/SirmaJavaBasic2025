import java.util.Scanner;

public class Task33_TreePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter high of tree:");
		int high = Integer.parseInt(sc.nextLine());
		int counter = 1;
		for (int i = 1; i <= high ; i++) {
			System.out.print(" ".repeat(high - i));
			System.out.println("*".repeat(counter));
			counter += 2;
		}
		System.out.print(" ".repeat(high - 1));
		System.out.println("*");
	}
}
