import java.util.Arrays;
import java.util.Scanner;

public class Task15_LastKNumbersSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int length = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number of elements k = :");
		int k = Integer.parseInt(sc.nextLine());
		int[] array = new int[length];
		array[0] = 1;

		/* Тъй като по задание първия елемент е 1 (а той е с индекс 0),
		затова започвам итерацията от втория елемент (с индекс 1).
		 */
		for (int i = 1; i <= array.length - 1; i++) {
			int newElement = 0;
			/* използвам променливата j за да обхождам предишните елементи на масива
			без да влиая на текущия елемент, които трябва да изчислявам.
			 */
			int j = i;
			for (int p = k; p >= 1; p--) {
				if(j - p < 0){
					j = p;
				}
				newElement += array[j - p];
			}
			array[i] = newElement;
		}
		/*
		Принтирам изходните данни с цикъл, а не с функцията Arrays.toString(),
		за да е визията консистентна със заданието
		 */
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
