import java.util.Scanner;
import java.util.Arrays;

public class Task05_SumEvenNumbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] array = sc.nextLine().split(",");
		int[] arrayInt = Arrays.stream(array)
						.mapToInt(Integer::parseInt)
						.toArray();
		int sum = 0;
		for (int i = 0; i <= arrayInt.length - 1; i++) {
			if(arrayInt[i] % 2 == 0){
				sum += arrayInt[i];
			}
		}
		System.out.println(sum);
	}
}
