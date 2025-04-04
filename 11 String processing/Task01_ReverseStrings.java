import java.util.Scanner;
public class Task01_ReverseStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		String text = sc.nextLine();
		while (!text.equals("end")){
			StringBuilder reverseText = new StringBuilder();
			for (int i = text.length() - 1; i >= 0 ; i--) {
				char ch = text.charAt(i);
				reverseText.append(ch);
			}

				System.out.println(text + " = " + reverseText.toString());
				System.out.println("Enter word:");
				text = sc.nextLine();
		}
	}
}
