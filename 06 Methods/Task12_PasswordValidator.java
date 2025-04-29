import java.util.Locale;
import java.util.Scanner;

public class Task12_PasswordValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		passwordCheck(password);
	}

	public static boolean correctLenght(String inputPassword){
		boolean isTrue = inputPassword.length() >= 6 && inputPassword.length() <= 10;
		return isTrue;
	}

	public static boolean containsNums(String inputPassword){
		int numCounter = 0;
		boolean isTrue = false;
		for (int i = 0; i < inputPassword.length(); i++) {
			char currentSymbol = inputPassword.charAt(i);
			if (currentSymbol >= '0' && currentSymbol <= '9'){
				numCounter++;
			}
			if (numCounter >= 2){
				isTrue = true;
				break;
			}
		}
		return  isTrue;
	}

	public static boolean containsLettersDigits(String inputPassword){

		int numCounter = 0;
		int letterCounter = 0;
		String passwordToCheck = inputPassword.toLowerCase();
		for (int i = 0; i < passwordToCheck.length(); i++) {
			char currentSymbol = passwordToCheck.charAt(i);
			if (currentSymbol >= '0' && currentSymbol <= '9'){
				numCounter++;
			} if (currentSymbol >= 'a' && currentSymbol <= 'z') {
				letterCounter++;
			}

		}

		boolean isTrue = numCounter > 0 && letterCounter > 0;
		return isTrue;
	}

	public static void passwordCheck(String password){
	if(correctLenght(password) && containsNums(password) && containsLettersDigits(password)){
		System.out.println("Password is valid");
	} else {
		if (!correctLenght(password)) {
			System.out.println("Password must be between 6 and 10 characters");
		} if (!containsNums(password)) {
			System.out.println("Password must have at least 2 digits");
		}  if (!containsLettersDigits(password)){
			System.out.println("Password must contain only letters and digits");
		}
	}
	}
}
