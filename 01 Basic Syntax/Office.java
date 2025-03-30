import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of first cabinet:");
        double priceFirstCabinet = Double.parseDouble(sc.nextLine());
        double priceSecondCabinet = 0.8 * priceFirstCabinet;
        double priceThirdCabinet = 1.15 * (priceFirstCabinet + priceSecondCabinet);
        double totalPrice = priceFirstCabinet + priceSecondCabinet +priceThirdCabinet;

        System.out.printf("%.3f", totalPrice);
    }
}
