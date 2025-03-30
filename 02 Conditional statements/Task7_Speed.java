import java.util.Scanner;

public class Task7_Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed:");
        double speed = Double.parseDouble(sc.nextLine());
        String speedInfo = "";
        if (speed <= 10){
            speedInfo = "slow";
        } else if (10 < speed && speed <= 60) {
            speedInfo = "average";
        } else if (60 < speed && speed <= 120) {
            speedInfo = "fast";
        } else if (120 < speed && speed <= 160) {
            speedInfo = "super-fast";
        } else {
            speedInfo = "turbo-fast";
        }
        System.out.println(speedInfo);
    }
}
