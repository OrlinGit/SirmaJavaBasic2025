import java.util.Scanner;

public class Task23_MovieClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 13){
            System.out.println("Only U-rated movies");
        } else if (age <= 17) {
            System.out.println("U and PG-13 rated movies");
        } else {
            System.out.println("All movies");
        }
    }
}
