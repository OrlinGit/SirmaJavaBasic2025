import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task13_ParkingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> pargingRegister = new HashMap<>();
		System.out.println("Enter number of commands: ");
		int numberOfCommands = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numberOfCommands; i++) {
			System.out.println("Enter command: ");
			String[] command = sc.nextLine().split(" ");
			String currentCommand = command[0];
			if(currentCommand.equals("Register")){
				String name = command[1];
				String licensePlate = command[2];
				if(pargingRegister.containsKey(name)){
					System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
				} else {
					pargingRegister.putIfAbsent(name, licensePlate);
					System.out.printf("%s registered %s successfully.%n", name, licensePlate);
				}
			} else if(currentCommand.equals("Unregister")) {
				String name = command[1];
				if(!pargingRegister.containsKey(name)){
					System.out.printf("ERROR: user %s not found.%n", name);
				} else {
					pargingRegister.remove(name);
					System.out.printf("%s unregistered successfully.%n", name);
				}

			}

		}

		for(Map.Entry<String, String> entry : pargingRegister.entrySet()){
			System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
		}
	}
}
