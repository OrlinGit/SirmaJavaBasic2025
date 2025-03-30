import java.util.Scanner;

public class Task19_MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input age:");
        int age = Integer.parseInt(sc.nextLine());
        if (age <= 12){
            System.out.println("$5");
        } else if (age <= 19) {
            System.out.println("$8");
        } else if (age >= 20) {
            System.out.println("$10");
        }
    }
}
