import java.util.Scanner;

public class Task05_Shop {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter product:");
		String inputProduct = sc.nextLine();
		System.out.println("Enter quantity:");
		int inputQuantity = Integer.parseInt(sc.nextLine());
		double priceOfOrder = priceOfOrder(inputProduct, inputQuantity);
		System.out.printf("%.2f", priceOfOrder);

	}
	public static double priceOfOrder(String product, int quantity){
		double price = 0.0;
		switch (product){
			case "coffee":
				price = 1.50;
				break;
			case "water":
				price = 1.00;
				break;
			case "coke":
				price = 1.40;
				break;
			case "snacks":
				price = 2.00;
				break;
		}
		return price * quantity;
	}
}
