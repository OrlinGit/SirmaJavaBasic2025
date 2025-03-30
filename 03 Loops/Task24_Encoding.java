import java.util.Scanner;
public class Task24_Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = Integer.parseInt(sc.nextLine());
        int currentDigit = 0;
        while (number > 0){
            currentDigit = number % 10;
            if(currentDigit == 0){
                System.out.println("ZERO");
            }else{
                for (int i = 0; i < currentDigit; i++) {
                    int i1 = currentDigit + 33;
                    System.out.print((char)i1);
                }
                System.out.println();
            }
            number /= 10;
        }
    }
}
