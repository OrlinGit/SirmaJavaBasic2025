import java.util.*;
import java.util.stream.Collectors;

public class Task11_LargestThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> lineOfNumbers = new TreeSet<>(Comparator.reverseOrder());
		System.out.println("Enter line of numbers: ");
		String[] input = sc.nextLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			lineOfNumbers.add(Integer.parseInt(input[i]));
		}

		int counter = 0;
		if(lineOfNumbers.size() < 3){
			counter = lineOfNumbers.size();
		} else {
			counter = 3;
		}

		String result = lineOfNumbers.stream()
				.limit(counter)
				.map(String::valueOf)
				.collect(Collectors.joining(" "));

		System.out.println(result);
	}
}
