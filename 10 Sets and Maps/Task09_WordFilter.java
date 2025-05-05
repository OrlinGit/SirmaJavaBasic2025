import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task09_WordFilter {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter words: ");
		String[] input = sc.nextLine().split(" ");
		//Използвам LinkedSet тъй като в примера думите за подредени по реда на запис в Set-a
		Set<String> filteredWords = new LinkedHashSet<>();
		for (int i = 0; i < input.length; i++) {
			String currentWord = input[i];
			if (currentWord.length() %2 == 0){
				filteredWords.add(currentWord);
			}
		}

		for(String element : filteredWords){
			System.out.println(element);
		}
	}
}
