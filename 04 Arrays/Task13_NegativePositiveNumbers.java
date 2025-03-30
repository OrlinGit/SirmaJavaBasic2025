import java.util.Arrays;
import java.util.Scanner;

public class Task13_NegativePositiveNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] input = sc.nextLine().split(", ");
		int[] array = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		int[] newArray = new int[array.length];
		/*
		Вкарвам два брояча, които да преброят броя позитивни и негативни числа.
		По този начин ще използвам броячите за да "обхождам" масива едновремнно в двете посоки само с
		един цикъл.
		 */
		int negativeCounter = 0;
		int positiveCounter = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] < 0) {
				negativeCounter++;
			} else {
				positiveCounter++;
			}
		}
		for (int j = 0; j <= array.length - 1; j++) {
			if (array[j] < 0) {
					newArray[negativeCounter - 1] = array[j];
					negativeCounter--;
			} else {
					newArray[newArray.length - positiveCounter] = array[j];
					positiveCounter--;
			}
		}
		for (int i = 0; i <= newArray.length - 1; i++) {
			System.out.println(newArray[i]);
		}
	}
}
