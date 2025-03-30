import java.util.Scanner;
public class Task12_PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int p1 = 0;
        int p2 = 1;
            for (int i = 0; i <= n; i++) {
                sum += p1;
                int p3 = p1 + p2;
                p1 = p2;
                p2 = p3;
        }
        System.out.println(sum);
    }
}

