import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02_ConstructorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cars:");
		int numberOfCars = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= numberOfCars; i++) {
			System.out.println("Enter car data:");
			String input = sc.nextLine();
			List<String> carData = Arrays.stream(input.split(" "))
					.toList();
			if (carData.size() == 1){
				CarInfo car = new CarInfo(carData.getFirst());
				car.getCarInfo();
			} else if (carData.size() == 2) {
				String brandInput = carData.get(0);
				String modelInput = carData.get(1);
				CarInfo car = new CarInfo(brandInput, modelInput);
				car.getCarInfo();
			} else if (carData.size() == 3) {
				String brandInput = carData.get(0);
				String modelInput = carData.get(1);
				int horsePowerInput = Integer.parseInt(carData.get(2));
				CarInfo car = new CarInfo(brandInput, modelInput, horsePowerInput);
				car.getCarInfo();
			}
		}
	}
}
