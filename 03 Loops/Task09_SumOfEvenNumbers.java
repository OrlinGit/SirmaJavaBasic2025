import java.util.Scanner;

public class Task09_SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * 2);
        }
        System.out.println(sum);
    }
}
