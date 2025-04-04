import java.util.Scanner;

public class Task02_RepeatStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder concatString = new StringBuilder();
		System.out.println("Enter string:");
		String[] strings = sc.nextLine().split(" ");
		for (int i = 0; i < strings.length; i++) {
			String currentString = strings[i];
			for (int j = 0; j < currentString.length(); j++) {
				concatString.append(currentString);
			}
		}

		System.out.println(concatString.toString());
	}


}
