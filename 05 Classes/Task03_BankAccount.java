import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Task03_BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int counterAccounts = 0;
		while(!input.equals("End")){
			String[] commands = input.split(" ");
			List<String> commandsSplit = Arrays.stream(commands)
					.toList();
			String action = commandsSplit.get(0);
			if(action.equals("Create")){
				BankAccount ID;(counterAccounts) = new BankAccount().getId();
				System.out.printf("Account ID%d created", counterAccounts);
				counterAccounts++;
			} else if (action.equals("Deposit")) {
				int accountID = Integer.parseInt(commandsSplit.get(1));
				int amount = Integer.parseInt(commandsSplit.get(2));

			}
		}
	}



}
