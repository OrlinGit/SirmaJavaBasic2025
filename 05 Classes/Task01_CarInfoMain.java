import java.util.Scanner;

public class Task01_CarInfoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cars:");
		int numberOfCars = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= numberOfCars; i++) {
			System.out.println("Enter car info:");
			CarInfo car = new CarInfo();
			String[] carInformation = sc.nextLine().split(" ");
			String brandInput = carInformation[0];
			String modelInput = carInformation[1];
			int horsePowerInput = Integer.parseInt(carInformation[2]);

			car.getCarInfo();
			/*
			car.setBrand(brandInput);
			car.setModel(modelInput);
			car.setHorsePower(horsePowerInput);
			System.out.println(car.getCarInfo());

			 */
		}

	}
}