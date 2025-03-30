import javax.swing.*;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight:");
        int weight = Integer.parseInt(sc.nextLine());
        System.out.println("Enter height:");
        double height = Double.parseDouble(sc.nextLine());
        double bmi = weight / Math.pow(height, 2.0);
        System.out.printf("%.2f", bmi);
    }
}
