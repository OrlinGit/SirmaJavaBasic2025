import java.util.Scanner;

public class Task1_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Слагам си надпис на конзолата за да ме подсеща какво правя,
        и да има по-приветлива комуникация с програмата.
         */
        System.out.println("Enter mark:");
        double mark = Double.parseDouble(sc.nextLine());
        if (mark >= 5.50){
            System.out.println("Excellent!");
        }
    }
}