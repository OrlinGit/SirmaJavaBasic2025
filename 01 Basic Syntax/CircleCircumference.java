import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double radius = Double.parseDouble(sc.nextLine());
        double circumference = 2 * Math.PI * radius;
        System.out.printf("%.2f", circumference);
    }
}
