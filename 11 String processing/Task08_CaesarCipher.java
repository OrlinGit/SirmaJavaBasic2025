import java.util.Scanner;

public class Task08_CaesarCipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to cypher: ");
		String text = sc.nextLine();
		StringBuilder encodedText = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			encodedText.append((char)(text.charAt(i) + 3));
		}

		System.out.println(encodedText.toString());
	}
}
