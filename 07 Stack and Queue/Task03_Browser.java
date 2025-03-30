import java.util.ArrayDeque;
import java.util.Scanner;

public class Task03_Browser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter URL:");
		String input = sc.nextLine();
		ArrayDeque<String> history = new ArrayDeque<>();
		while (!input.equals("Home")) {
			if (input.equals("back")) {
				history.pop();
				if (history.isEmpty()) {
					System.out.println("no previous URLs");
				} else {
					System.out.println(history.peek());
				}
			} else {
				history.push(input);
				System.out.println(input);
			}
			System.out.println("Enter URL:");
			input = sc.nextLine();
		}
	}
}
