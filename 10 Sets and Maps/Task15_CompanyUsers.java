import java.util.*;

public class Task15_CompanyUsers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Map<String, HashSet<String>> listOfEmployees = new HashMap<>();
		System.out.println("Enter employee ID: ");
		String input = sc.nextLine();
		while(!input.equals("End")){
			String[] employeeInformation = input.split("->");
			String company = employeeInformation[0];
			String employeeID = employeeInformation[1];
			if(listOfEmployees.containsKey(company)) {
				HashSet<String> currentListOfEmployees = listOfEmployees.get(company);
				currentListOfEmployees.add(employeeID);
				listOfEmployees.put(company, currentListOfEmployees);
			} else {
				HashSet<String> currentListOfEmployees = new HashSet<>();
				currentListOfEmployees.add(employeeID);
				listOfEmployees.put(company, currentListOfEmployees);
			}
			input = sc.nextLine();
		}

		for (Map.Entry<String, HashSet<String>> entry : listOfEmployees.entrySet()){
			String companyName = entry.getKey();
			//HashSet<String> employees = entry.getValue();
			List<String> employeesList = entry.getValue().stream().toList();
			System.out.println(companyName);
			for (int i = 0; i < employeesList.size(); i++) {
				System.out.printf("--%s%n", employeesList.get(i));
			}
		}

	}
}
