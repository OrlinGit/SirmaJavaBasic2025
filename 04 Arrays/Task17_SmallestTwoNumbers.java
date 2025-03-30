import java.util.Scanner;
import java.util.Arrays;

public class Task17_SmallestTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array:");
		String[] input = sc.nextLine().split(", ");
		int[] array = Arrays.stream(input)
				.mapToInt(Integer::parseInt)
				.toArray();
		/*
		Създавам си финален масив само с два елемента.
		И създавам две промеливи, които да ми съдържат най-малките числа.
		Ако двете първи числа в масива не са равни то те винаги ще са двете най-малки в масива.
		Затова ги пресвоявам като елементи, с които ще сравнявам.
		Това е й причината да започна да обикалям цикъла от втория елемент.
		 */
		int[] smallestNumbers = new int[2];
		int a = array[0];
		int b = array[1];
		for (int i = 2; i <= array.length - 1; i++) {
			if (array[i] < a) {
				a = array[i];
			}else if (array[i] < b && array[i] != a) {
				b = array[i];
			}
		}
		/* Това е проверка в случай, че масива е само от едно число или
		масива е смао от еднакви числа.
		*/
		if (a != b) {
			/*
			Следващата проверка я правя с цел числата да се принтират на изхода
			от по-малкото към по-голямото
			 */
			if(a < b) {
				smallestNumbers[0] = a;
				smallestNumbers[1] = b;
			}else{
				smallestNumbers[0] = b;
				smallestNumbers[1] = a;
			}
			for (int i = 0; i <= smallestNumbers.length - 1; i++) {
				System.out.print(smallestNumbers[i] + " ");
			}
		}else{
			System.out.println(a);
		}
	}
}
