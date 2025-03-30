import java.util.Scanner;

public class Task09_GreaterOfTwoValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter command:");
		String command = sc.nextLine();
		System.out.println("Enter first symbol:");
		String firstSymbolInput = sc.nextLine();
		System.out.println("Enter second symbol:");
		String secondSymbolInput = sc.nextLine();
		if(command.equals("string")){
			System.out.println(getMaxString(firstSymbolInput, secondSymbolInput));
		} else if (command.equals("char")) {
			System.out.println(getMaxChar(firstSymbolInput, secondSymbolInput));
		} else if (command.equals("int")) {
			System.out.println(getMaxInt(firstSymbolInput, secondSymbolInput));
		}
	}
	public static int getMaxInt(String firstInt, String secondInt){
		int firstNumber = Integer.parseInt(firstInt);
		int secondNumber = Integer.parseInt(secondInt);
		return Math.max(firstNumber, secondNumber);
	}
	public static char getMaxChar(String firstCharInput, String secondCharInput){
		char firstChar = firstCharInput.charAt(0);
		char secondChar = secondCharInput.charAt(0);
		char biggerChar = ' ';
		if(firstChar > secondChar){
			biggerChar = firstChar;
		}else{
			biggerChar = secondChar;
		}
		return  biggerChar;
	}
	public static String getMaxString(String firstString, String secondString){
		String biggertString = "";
		if(firstString.compareTo(secondString) > 0){
			biggertString = firstString;
		}else{
			biggertString = secondString;
		}
		return biggertString;
	}
}
