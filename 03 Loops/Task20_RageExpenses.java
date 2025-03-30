
import java.util.Scanner;
public class Task20_RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lost games:");
        int gamesLost = Integer.parseInt(sc.nextLine());
        System.out.println("Enter headset price:");
        double headSetPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Enter mouse price:");
        double mousePrice = Double.parseDouble(sc.nextLine());
        System.out.println("Enter keyboard price :");
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Enter price of display:");
        double displayPrice = Double.parseDouble(sc.nextLine());
        int counterHeadSet = 0;
        int counterMouse = 0;
        int counterKeyboard = 0;
        int counterDisplay = 0;
        double totalExpenses = 0.0;
        for (int i = 1; i <= gamesLost; i++) {
            if(i % 2 == 0){
                counterHeadSet++;
            }if(i % 3 == 0){
                counterMouse++;
            }if(i % 6 == 0){
                counterKeyboard++;
            }if(i % 12 == 0){
                counterDisplay++;
            }
        }
        totalExpenses = (counterHeadSet * headSetPrice) + (counterMouse * mousePrice) +
                (counterKeyboard * keyboardPrice) + (counterDisplay * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
