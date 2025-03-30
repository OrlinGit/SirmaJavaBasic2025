import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance:");
        int distance = Integer.parseInt(sc.nextLine());
        System.out.println("Enter hours:");
        int hours = Integer.parseInt(sc.nextLine());
        System.out.println("Enter minutes:");
        int minutes = Integer.parseInt(sc.nextLine());
        System.out.println("Enter seconds:");
        int seconds = Integer.parseInt(sc.nextLine());

        double timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speed = distance / timeInSeconds;

        System.out.printf("%.6f", speed);
    }
}
