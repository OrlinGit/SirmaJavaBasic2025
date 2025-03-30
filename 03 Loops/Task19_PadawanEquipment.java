import java.util.Scanner;
public class Task19_PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter budget:");
        double budget = Double.parseDouble(sc.nextLine());
        System.out.println("Enter number of students:");
        int students = Integer.parseInt(sc.nextLine());
        System.out.println("Enter price of light saber:");
        double priceLightSaber = Double.parseDouble(sc.nextLine());
        System.out.println("Enter price of robe:");
        double priceRobe = Double.parseDouble(sc.nextLine());
        System.out.println("Enter price of belt:");
        double priceBelt = Double.parseDouble(sc.nextLine());
        double totalExpenses = 0.0;
        double costLightSabers = 0.0;
        double costRobes = 0.0;
        double costBelts = 0.0;
        costLightSabers = Math.ceil((students * 1.1)) * priceLightSaber;
        costRobes = students * priceRobe;
        if (students >= 6){
            int freeBelts = students / 6;
            costBelts = (students - freeBelts) * priceBelt;
        }else{
            costBelts = students * priceBelt;
        }
        totalExpenses = costLightSabers + costRobes + costBelts;
        if(budget >= totalExpenses){
            System.out.printf("The money is enough - it would cost %.2f lv.", totalExpenses);
        }else{
            double difference = totalExpenses - budget;
            System.out.printf("George Lucas will need %.2f lv more.", difference);
        }
    }
}
