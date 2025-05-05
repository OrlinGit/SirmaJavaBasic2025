import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task07_WordSynonyms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, ArrayList<String>> dictionary = new LinkedHashMap<>();
		System.out.println("Set number of words: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Enter word: ");
			String word = sc.nextLine();
			System.out.println("Enter synonym: ");
			String synonym = sc.nextLine();
			// Създавам всеки път нов ArrayList currentList за да не се налага да го нулирам след всяко използване.
			if (dictionary.containsKey(word)){
				ArrayList<String> currentList = dictionary.get(word);
				currentList.add(synonym);
				dictionary.put(word, currentList);
			} else {
				ArrayList<String> currentList = new ArrayList<>();
				currentList.add(synonym);
				dictionary.putIfAbsent(word, currentList);
			}
		}

		for (Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()){
			System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
		}
	}
}
