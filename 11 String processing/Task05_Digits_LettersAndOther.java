import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task05_Digits_LettersAndOther {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = sc.nextLine();
		Pattern patternNumbers = Pattern.compile("[0-9]*");
		Matcher matcherNumbers = patternNumbers.matcher(text);
		while(matcherNumbers.find()) {
			System.out.print(matcherNumbers.group());
		}

		System.out.println();
		Pattern patternLetters = Pattern.compile("[A-Za-z]*");
		Matcher matcherLetters = patternLetters.matcher(text);
		while(matcherLetters.find()){
			System.out.print(matcherLetters.group());
		}

		System.out.println();
		Pattern patternChars = Pattern.compile("\\W");
		Matcher matcherChars = patternChars.matcher(text);
		while(matcherChars.find()){
			System.out.print(matcherChars.group());
		}

	}
}
