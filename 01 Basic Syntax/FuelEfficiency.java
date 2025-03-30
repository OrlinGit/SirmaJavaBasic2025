import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter traveled distance:");
        double distance = Double.parseDouble(sc.nextLine());
        System.out.println("Enter used fuel:");
        int fuel = Integer.parseInt(sc.nextLine());
        double fuelEfficiency = distance / fuel;
        System.out.println(fuelEfficiency);
    }
}
