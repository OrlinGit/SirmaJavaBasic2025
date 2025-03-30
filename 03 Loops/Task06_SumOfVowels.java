import java.util.Scanner;

public class Task06_SumOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter){
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
