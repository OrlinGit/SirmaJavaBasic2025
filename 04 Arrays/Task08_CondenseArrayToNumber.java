import java.util.Arrays;
import java.util.Scanner;

public class Task08_CondenseArrayToNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] input = sc.nextLine().split(",");
		int[] array = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		int[] manipulatedArray = new int[array.length - 1];
		while (manipulatedArray.length > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				manipulatedArray[i] = array[i] + array[i + 1];
				if (i == manipulatedArray.length - 1) {
					array = manipulatedArray;
					manipulatedArray = new int[array.length - 1];
				}
			}
		}
		System.out.println(array[0]);
	}
}
/*
if (array.length == 1) {
				System.out.println(array[0]);
			}

 */