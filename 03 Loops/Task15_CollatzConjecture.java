import java.util.Scanner;

public class Task15_CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print(n + " ");
        while (n != 1){
            if (n % 2 == 0){
                n /= 2;
                System.out.print(n + " ");
            }else{
                n = (n * 3) + 1;
                System.out.print(n + " ");
            }
        }
    }
}
