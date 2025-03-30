import java.util.Scanner;
import java.util.Arrays;
public class Task14_FirstAndLastKNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements - k:");
		int k = Integer.parseInt(sc.nextLine());
		System.out.println("Enter array:");
		String[] input = sc.nextLine().split(", ");
		int[] array = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		for (int i = 0; i <= k - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = array.length - k; i <= array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
