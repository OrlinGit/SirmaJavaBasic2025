import java.util.Scanner;

public class Task11_NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = Integer.parseInt(sc.nextLine());
        if( -100 <= number && number <= 100 && number != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
