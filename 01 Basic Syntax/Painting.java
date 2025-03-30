import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total quantity of paint:");
        double paint = Double.parseDouble(sc.nextLine());
        double totalRedPaint = paint / 13;
        double totalYellowPaint = 4 * (paint / 13);
        double totalWhitePaint = 8 * (paint / 13);

        System.out.printf("Red: %.4f", totalRedPaint);
        System.out.println();
        System.out.printf("Yellow: %.4f", totalYellowPaint);
        System.out.println();
        System.out.printf("White: %.4f", totalWhitePaint);
    }
}
