import java.util.Scanner;
public class Task26_EvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first pair:");
        int firstPair = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second pair:");
        int secondPair = Integer.parseInt(sc.nextLine());
        System.out.println("Enter first limit:");
        int limitFirstPair = Integer.parseInt(sc.nextLine());
        System.out.println("Enter secondLimit:");
        int limitSecondPair = Integer.parseInt(sc.nextLine());
        for (int i = firstPair; i <= (firstPair + limitFirstPair); i++) {
            for (int j = secondPair; j <= (secondPair + limitSecondPair); j++) {
                if ((j % 2 != 0 && j % 3 != 0 && j % 5 != 0) && (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)) {
                     {
                         System.out.printf("%d%d", i, j);
                         System.out.println();
                    }
                }
            }

        }
    }
}
