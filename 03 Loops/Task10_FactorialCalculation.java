import java.util.Scanner;

public class Task10_FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = Integer.parseInt(sc.nextLine());
        int result = 1;
        for (int i = num; i >=1 ; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
