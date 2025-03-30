import java.util.Scanner;

public class Task30_SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= number ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
