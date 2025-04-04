import java.util.Scanner;
import java.util.regex.*;

public class Task03_Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String to remove:");
		String textToRemove = sc.nextLine();
		System.out.println("Enter text:");
		StringBuilder text = new StringBuilder(sc.nextLine());
		//tringBuilder finalString = new StringBuilder();
		while(text.indexOf(textToRemove) != -1){
		int matchIndex = text.indexOf(textToRemove);
		text = text.delete(matchIndex, matchIndex + textToRemove.length());
		}

		System.out.println(text);
	}
}
