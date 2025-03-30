import java.util.Scanner;
public class Task13_PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();
        String palindrome = "";
        for (int i = input.length() - 1; i >=0 ; i--) {
            palindrome += input.charAt(i);
        }
        System.out.println(palindrome.equals(input));
    }
}
