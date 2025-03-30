import java.util.ArrayDeque;
import java.util.Scanner;

public class Task13_DocumentEditor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> stackMain = new ArrayDeque<>();
		ArrayDeque<String> stackUndo = new ArrayDeque<>();
		System.out.println("Enter command:");
		String[] input = sc.nextLine().split("\\(\"|\"\\)");
		String command = input[0];
		while(!command.equals("End")) {
			if (command.equals("Insert")) {
				String text = input[1];
				stackMain.add(text);
				printStack(stackMain);
			} else if (command.equals("Undo()")) {
				stackUndo.add(stackMain.pollLast());
				printStack(stackMain);
			} else if (command.equals("Redo()")) {
				stackMain.add(stackUndo.pollLast());
				printStack(stackMain);
			}
			System.out.println();
			System.out.println("Enter command:");
			input = sc.nextLine().split("\\(\"|\"\\)");
			command = input[0];
		}
	}
	// Използвам този метод да принтирам stack-а, защото още не сум стигнал в знанията си до по-лесни методи.
	public static void printStack(ArrayDeque<String> stackToPrint){
		for (String el : stackToPrint){
			System.out.print(el);
		}
	}
}
