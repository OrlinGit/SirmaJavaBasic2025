import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task07_EqualArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array:");
		String[] inputFirstArray = sc.nextLine().split(",");
		int[] firstArray = Arrays.stream(inputFirstArray)
				.mapToInt(Integer::parseInt)
				.toArray();
		System.out.println("Enter first array:");
		String[] inputSecondArray = sc.nextLine().split(",");
		int[] secondArray = Arrays.stream(inputSecondArray)
				.mapToInt(Integer::parseInt)
				.toArray();
		int sumFirstArray = 0;
		int sumSecondArray = 0;
		for (int i = 0; i <= firstArray.length - 1 ; i++) {
			sumFirstArray += firstArray[i];
		}
		for (int i = 0; i <= secondArray.length - 1; i++) {
			sumSecondArray += secondArray[i];
		}
		if (sumFirstArray == sumSecondArray){
			System.out.printf("Arrays are identical. Sum: %d", sumFirstArray);
		}else{
			for (int i = 0; i <= firstArray.length - 1; i++) {
				if(firstArray[i] != secondArray[i]){
					System.out.printf("Arrays are not identical. Found difference at %d index", i);
					break;
				}
			}
		}

	}
}
