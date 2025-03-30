import java.util.Scanner;
import java.util.Arrays;
public class Task06_EvenAndOddSubtraction {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter array");
		String[] arrayAsString = sc.nextLine().split(",");
		int[] arrayAsInt = Arrays.stream(arrayAsString)
				.mapToInt(Integer::parseInt)
				.toArray();
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i <= arrayAsInt.length - 1; i++) {
			if(arrayAsInt[i] % 2 == 0){
				sumEven += arrayAsInt[i];
			}else{
				sumOdd += arrayAsInt[i];
			}
		}
		System.out.println(sumEven - sumOdd);
	}
}
