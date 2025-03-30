import java.util.Scanner;

public class Task05_LettersInAWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = sc.nextLine();
        for (int i = 0; i <= word.length()-1; i++) {
            System.out.println(word.charAt(i));
        }
    }
}
