import java.util.Scanner;
public class Task04_TextFilter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words to be replaced:");
		String[] wordsToReplace = sc.nextLine().split(", ");
		System.out.println("Enter text:");
		String text = sc.nextLine();
		StringBuilder textToReplace = new StringBuilder();
		for (int i = 0; i < wordsToReplace.length; i++) {
			String toReplace = wordsToReplace[i];
			int lengthOfString = toReplace.length();
			for (int j = 0; j < lengthOfString; j++) {
				textToReplace.append('*');
			}
			text = text.replaceAll(toReplace, textToReplace.toString());
			textToReplace.setLength(0);
		}

		System.out.println(text);
	}
}
