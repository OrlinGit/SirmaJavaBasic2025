import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units consumed:");
        int units = Integer.parseInt(sc.nextLine());
        System.out.println("Enter price per unit:");
        double price = Double.parseDouble(sc.nextLine());
        int fixedCharge = 10;
        double totalBill = (units * price) + 10;
        System.out.println(totalBill);
    }
}
