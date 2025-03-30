import java.util.Scanner;

public class Task04_Numbers1ToNThroughM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter step:");
        int m = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i += m) {
            System.out.println(i);
        }
    }
}
