import java.util.Scanner;

public class Task09_MultiplyBigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		/*
		Тъй като по условие първия множител може да е цифра по-голяма
		и то long затова го записваме в String за да прочетем цялата цифра
		без да губим част от нея.
		 */
		String firstNumber = sc.nextLine();
		System.out.println("Enter single digit number: ");
		int n = Integer.parseInt(sc.nextLine());
		/*
		Умножението с много големи цифри може да се направи като цифрата се раздели на две части.
		Всяка част се умножава отделно по другия множител. А после двата резултата просто се
		конкатенират. Но не трябва да забравяме пренасянето ако едната цифра след умножение стане
		по-голяма с един порядък!
		-> 36 * 3 = (3 * 3) конкатенирано с (6 * 3) като остатъка от 6 * 3 се прехвърли.
		36 * 3 = (3 * 3) concat (6 * 3) -> 9 concat 18 -> десетицата от 18 се прехвърля
		и тогава се кокатенират -> (9 + 1) concat 8 = 10 concat 8 -> 108!
		 */
		int lenght = firstNumber.length();
		long leftHalfInput = Long.parseLong(firstNumber.substring(0, lenght / 2));
		long rightHalfInput = Long.parseLong(firstNumber.substring(lenght / 2, lenght));
		long overflow = 0;
		long overflowSubtrahend = 0;
		long rightHalfOut = rightHalfInput * n;
		long leftHalfOut = leftHalfInput * n;
		String rightHalfString = String.valueOf(rightHalfOut);
		if (rightHalfString.length() > lenght / 2){
			overflow = rightHalfOut;
			for (int i = 0; i < rightHalfString.length() - 1; i++) {
				overflow = overflow / 10;
			}
		}

		if (overflow > 0){
			overflowSubtrahend = overflow;
			for (int i = 0; i < rightHalfString.length() - 1; i++) {
				overflowSubtrahend = overflowSubtrahend* 10;
			}
		}

		System.out.printf("%d%d", leftHalfOut + overflow, rightHalfOut - overflowSubtrahend);

	}
}
