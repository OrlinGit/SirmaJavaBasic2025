import java.util.Scanner;

public class Task11_NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = Integer.parseInt(sc.nextLine());
        while (num != 0){
            int currentDigit = num % 10;
            System.out.print(currentDigit);
            num /= 10;
        }
    }
}
