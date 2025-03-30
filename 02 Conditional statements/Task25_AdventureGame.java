import java.util.Scanner;

public class Task25_AdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter possession in right hand:");
        String rightHand = sc.nextLine();
        System.out.println("Enter possession in left hand:");
        String leftHand = sc.nextLine();
        String output = "";
        if (rightHand.equals("sword")){
            if (leftHand.equals("shield")){
                output = "Path to the castle";
            } else {
                output = "Path to the forest";
            }
        } else if (rightHand.equals("map")) {
            if (leftHand.equals("coins")){
                output = "Go to the town";
            } else {
                output = "Camp";
            }
        } else {
            output = "Wander aimlessly";
        }
        System.out.println(output);
    }
}
