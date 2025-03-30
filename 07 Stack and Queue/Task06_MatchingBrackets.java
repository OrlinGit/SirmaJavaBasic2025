import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Scanner;

public class Task06_MatchingBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter formula:");
		String formula = sc.nextLine();
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int startIndex;
		int endIndex;
		for (int i = 0; i <= formula.length() - 1; i++) {
			if (formula.charAt(i) == '('){
				stack.push(i);
			} else if (formula.charAt(i) == ')') {
				endIndex = i;
				startIndex = stack.pop();
				for (int j = startIndex; j <= endIndex; j++) {
					System.out.print(formula.charAt(j));
				}
				System.out.println();
			}
		}
	}
}
