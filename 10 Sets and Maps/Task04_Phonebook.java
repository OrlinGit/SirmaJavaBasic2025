import java.util.HashMap;
import java.util.Scanner;

public class Task04_Phonebook {
	public static void main(String[] args) {
		HashMap<String, Long> contacts = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter command:");
		String input = sc.nextLine();
		while (!input.equals("stop")) {
			if (input.equals("search")) {
				System.out.println("Enter name to search: ");
				String name = sc.nextLine();
				search(name, contacts);
			} else {
				String[] contact = input.split("-");
				String name = contact[0];
				long number = Long.parseLong(contact[1]);
				contacts = addContact(name, number);
			}
			System.out.println("Enter command: ");
			input = sc.nextLine();
		}

	}

	public static void search(String nameToSearch, HashMap<String, Long> allContacts) {
		if (allContacts.containsKey(nameToSearch)) {
			System.out.println(nameToSearch + " -> " + allContacts.get(nameToSearch));
		} else {
			System.out.printf("Contact %s not found.\r\n", nameToSearch);
		}

	}

	public static HashMap<String, Long> addContact(String nameToAdd, long numberTodAdd) {
		HashMap<String, Long> updatedContactList = new HashMap<>();
		updatedContactList.put(nameToAdd, numberTodAdd);
		return updatedContactList;
	}


}
