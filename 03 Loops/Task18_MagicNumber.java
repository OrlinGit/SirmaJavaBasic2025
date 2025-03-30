import java.util.Scanner;

public class Task18_MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start of interval:");
        int start = Integer.parseInt(sc.nextLine());
        System.out.println("Enter end of interval:");
        int stop = Integer.parseInt(sc.nextLine());
        System.out.println("Enter magic number:");
        int magicNumber = Integer.parseInt(sc.nextLine());
        int counter = 0;
        int sum = 0;
        boolean isMagicNumber = true;
        for (int i = start; i <= stop; i++) {
            for (int j = start; j < stop + 1; j++) {
                sum = i + j;
                counter++;
                if (sum == magicNumber){
                    System.out.printf("Combination %d - (%d + %d = %d)", counter, i, j, magicNumber);
                    isMagicNumber = false;
                    return;
                }
            }
        }
        if(isMagicNumber){
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
