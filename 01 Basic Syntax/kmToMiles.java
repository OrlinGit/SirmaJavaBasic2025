import  java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        double mile = 0.621371192;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km.:");
        double kilometres = Double.parseDouble(sc.nextLine());
        double distanceInMiles = kilometres * mile;

        System.out.println(distanceInMiles);
    }
}
