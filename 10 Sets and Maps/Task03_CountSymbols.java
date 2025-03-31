import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task03_CountSymbols {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String input = sc.nextLine();
		char[] text = input.toCharArray();
		Map<Character, Integer> sortedChars = new TreeMap<>();
		int count = 1;
		for(char alphabet : text){
			if(!sortedChars.containsKey(alphabet)){
				sortedChars.put(alphabet, count);
			} else {
				int currentCount = sortedChars.get(alphabet);
				sortedChars.put(alphabet, ++currentCount);
			}
		}

		for (Map.Entry element : sortedChars.entrySet()){
			System.out.println(element.getKey() + ": " + element.getValue());
		}
	}
}
