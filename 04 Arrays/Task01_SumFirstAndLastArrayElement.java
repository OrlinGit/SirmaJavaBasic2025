import java.util.Scanner;
import java.util.Arrays;

public class Task01_SumFirstAndLastArrayElement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		String[] input = sc.nextLine().split(",");
		int [] numbers = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		int sum = numbers[0] + numbers[numbers.length - 1];
		System.out.println(sum);
	}
}
