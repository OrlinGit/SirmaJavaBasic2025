import java.util.Scanner;
public class Task21_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int n = i * 2 + 1;
            System.out.println(n);
            sum += n;
        }
        System.out.printf("Sum: %d", sum);
    }
}
