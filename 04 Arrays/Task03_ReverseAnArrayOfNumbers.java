import java.util.Arrays;
import java.util.Scanner;

public class Task03_ReverseAnArrayOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of new array:");
		int length = Integer.parseInt(sc.nextLine());
		System.out.println("Enter old array:");
		String[] arrayOld = sc.nextLine().split(",");
		int[] arrayOldAsInt = Arrays.stream(arrayOld)
				.mapToInt(Integer::parseInt)
				.toArray();
		int[] arrayNew = new int[length];
		int index = 0;
		for (int i = length - 1; i >= 0 ; i--) {
			arrayNew[index] = arrayOldAsInt[i];
			index++;
		}
		//тъй като в условието в output няма скоби за масив затова принтирам с цикъл
		for (int i = 0; i <= arrayNew.length - 1; i++) {
			System.out.print(arrayNew[i] + " ");
		}
		//System.out.println(Arrays.toString(arrayNew));
	}
}
