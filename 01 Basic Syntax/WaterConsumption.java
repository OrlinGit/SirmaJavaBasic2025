import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weekly water consumption:");
        double waterConsumption = Double.parseDouble(sc.nextLine());
        System.out.println("Enter people in household:");
        int people = Integer.parseInt(sc.nextLine());
        double dailyConsumptionPerPerson = (waterConsumption / 7) / people;
        System.out.println(dailyConsumptionPerPerson);
    }
}
