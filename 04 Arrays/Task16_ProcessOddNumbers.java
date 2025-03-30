import java.util.Scanner;
import java.util.Arrays;

public class Task16_ProcessOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] input = sc.nextLine().split(", ");
		int[] array = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		int[] newArray = new int[array.length / 2];
		int j = newArray.length - 1; // ще използвам тази променлива като индекс на новия масив
		for (int i = 0; i <= array.length - 1; i++) {
			if(i % 2 != 0){
				newArray[j] = array[i] * 2;
				j--;
			}
		}
		for (int i = 0; i <= newArray.length - 1; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
