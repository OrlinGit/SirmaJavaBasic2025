import java.util.Scanner;

public class Task26_PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first ingredient:");
        String ingredient1 = sc.nextLine();
        System.out.println("Enter second ingredient:");
        String ingredient2 = sc.nextLine();
        String potion = "";
        if (ingredient1.equals("herbs")){
            if (ingredient2.equals("water")) {
                potion = "Health potion";
            } else if (ingredient2.equals("oil")) {
                potion = "Stealth potion";
            } else {
                potion = "Minor stamina potion";
            }
        } else if (ingredient1.equals("berries")) {
            if (ingredient2.equals("sugar")){
                potion = "Speed potion";
            } else {
                potion = "Minor energy potion";
            }
        } else {
            potion = "No potion";
        }
        System.out.println(potion);
    }
}
