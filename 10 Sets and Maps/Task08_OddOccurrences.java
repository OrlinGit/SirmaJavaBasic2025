import java.lang.reflect.Array;
import java.util.*;

public class Task08_OddOccurrences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sequence of words: ");
		String[] input = sc.nextLine().toLowerCase().split(" ");
		Map<String, Integer> wordCounter = new LinkedHashMap<>();
		for (int i = 0; i < input.length; i++) {
			String currentWord = input[i];
			if(wordCounter.containsKey(currentWord)){
				int counter = wordCounter.get(currentWord);
				wordCounter.put(currentWord, ++counter);
			} else {
				wordCounter.putIfAbsent(currentWord, 1);
			}
		}

		ArrayList<String> oddOccurrences = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : wordCounter.entrySet()){
			if (entry.getValue() %2 != 0) {
				oddOccurrences.add(entry.getKey());
			}
		}

		System.out.println(String.join(", ", oddOccurrences));
	}
}
