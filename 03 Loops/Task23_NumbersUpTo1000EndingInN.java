import java.util.Scanner;
public class Task23_NumbersUpTo1000EndingInN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 1000; i++) {
            if(i % 10 == n){
                System.out.println(i);
            }
        }
    }
}
