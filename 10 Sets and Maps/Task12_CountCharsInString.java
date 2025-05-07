import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task12_CountCharsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.nextLine();
		Map<Character, Integer> charsCounter = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if(currentChar == ' '){

			} else if (charsCounter.containsKey(currentChar)) {
				int currentCounter = charsCounter.get(currentChar);
				charsCounter.put(currentChar, ++currentCounter);
			} else {
				charsCounter.put(currentChar, 1);
			}
		}

		for(Map.Entry<Character, Integer> entry : charsCounter.entrySet()){
			System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
		}
	}
}
