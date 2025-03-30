import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance:");
        int distance = Integer.parseInt(sc.nextLine());
        System.out.println("Enter time for travel:");
        int time = Integer.parseInt(sc.nextLine());
        double averageSpeed = (double) distance / time;
        System.out.println(averageSpeed);
    }
}
