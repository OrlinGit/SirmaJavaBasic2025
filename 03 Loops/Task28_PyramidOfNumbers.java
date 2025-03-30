import java.util.Scanner;
public class Task28_PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = Integer.parseInt(sc.nextLine());
        int counter = 0;
        for (int row = 1; row <= number; row++) {
            for (int i = 1; i <= row; i++) {
                counter++;
                if(counter > number) {
                    return;
                }
                System.out.print(counter + " ");
            }
            System.out.println();
        }
    }
}
