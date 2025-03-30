import java.util.Arrays;
import java.util.Scanner;

public class Task12_ExtractNonDecreasingSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] input = sc.nextLine().split(", ");
		int[] array = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		int referenceValue = Integer.MIN_VALUE;
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] >= referenceValue) {
				System.out.print(array[i] + " ");
				referenceValue = array[i];
			}
		}
	}
}
