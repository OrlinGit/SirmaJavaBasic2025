import javax.swing.*;
import java.util.Scanner;

public class Task27_SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time of day:");
        String timeOfDay = sc.nextLine();
        System.out.println("Enter environment:");
        String environment = sc.nextLine();
        System.out.println("Enter item:");
        String item = sc.nextLine();
        String decision = "";
        if (timeOfDay.equals("day")){
            if(environment.equals("forest")){
                switch (item){
                    case "knife":
                        decision = "Hunt for food";
                        break;
                    case "container":
                        decision = "Collect berries";
                        break;
                    default:
                        decision = "Explore";
                }
            } else if (environment.equals("desert")) {
                if (item.equals("hat")){
                    decision = "Search for water";
                } else {
                    decision = "Find shade";
                }
            }
        } else if (timeOfDay.equals("night")) {
            if (environment.equals("forest")){
                if (item.equals("firestarter")){
                    decision = "Make a campfire";
                } else {
                    decision = "Climb a tree for safety";
                }
            } else if (environment.equals("desert")) {
                if (item.equals("blanket")){
                    decision = "Sleep";
                } else {
                    decision = "Keep moving to stay warm";
                }
            }
        }
        System.out.println(decision);
    }
}
