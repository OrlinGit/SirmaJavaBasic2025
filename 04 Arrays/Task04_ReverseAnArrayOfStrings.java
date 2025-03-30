import java.util.Scanner;

public class Task04_ReverseAnArrayOfStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] array = sc.nextLine().split(",");
		String[] reversedArray = new String[array.length];
		int j = 0;
		for (int i = array.length - 1; i >= 0 ; i--) {
			reversedArray[j] = array[i];
			j++;
		}
		for (int i = 0; i <= reversedArray.length - 1; i++) {
			System.out.print(reversedArray[i] + " ");
		}
	}
}
