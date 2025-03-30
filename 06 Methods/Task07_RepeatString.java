import java.util.Scanner;

public class Task07_RepeatString {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter count to repeat:");
		int count = Integer.parseInt(sc.nextLine());
		System.out.println("Enter string:");
		String text = sc.nextLine();
		System.out.println(repeatString(text,count));


	}
	public static String repeatString(String inputText, int numbersToRepeat){
		return inputText.repeat(numbersToRepeat);
	}
}
