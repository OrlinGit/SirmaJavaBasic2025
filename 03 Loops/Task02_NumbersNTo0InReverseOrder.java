import java.util.Scanner;

public class Task02_NumbersNTo0InReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = n; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
}
