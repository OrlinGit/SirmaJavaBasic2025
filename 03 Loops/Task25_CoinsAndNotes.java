import java.util.Scanner;
public class Task25_CoinsAndNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of coins from 1 lv.:");
        int coinsBy1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of coins from 2 lv.:");
        int coinsBy2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of banknotes from 5 lv.:");
        int coinsBy5 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter sum:");
        int inputSum = Integer.parseInt(sc.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        int counter5 = 0;
        int sum = inputSum;
        for (int i = 0; i <= coinsBy1; i++) {
            for (int j = 0; j <= coinsBy2; j++) {
                for (int k = 0; k <= coinsBy5; k++) {
                    if (i * 1 + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.", i, j, k, inputSum);
                        System.out.println();
                    }
                }
            }
        }
    }
}
