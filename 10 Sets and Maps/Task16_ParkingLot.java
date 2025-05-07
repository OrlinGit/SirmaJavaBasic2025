import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task16_ParkingLot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> parkingLot = new HashSet<>();
		System.out.println("Enter car data: ");
		String input = sc.nextLine();
		while(!input.equals("END")){
		String[] carInfo = input.split(", ");
		String direction = carInfo[0];
		String carLicense = carInfo[1];
		if(direction.equals("IN")){
			parkingLot.add(carLicense);
		} else if (direction.equals("OUT")) {
			parkingLot.remove(carLicense);
		}

			input = sc.nextLine();
		}

		if(parkingLot.isEmpty()){
			System.out.println("Parking Lot is Empty");
		} else {
			List<String> parkingLotString = parkingLot.stream().toList();
			for(int i = 0; i < parkingLotString.size(); i++) {
				System.out.println(parkingLotString.get(i));
			}
		}

	}
}
