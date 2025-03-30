import java.util.Scanner;
public class Task27_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter change:");
        double changeDouble = Double.parseDouble(sc.nextLine());
        int change = (int)(changeDouble * 100);
        int coins = 0;
        while (change > 0){
            if(change >= 200){
                int i = 0;
                i = change / 200;
                coins += i;
                change = change - (i * 200);
            } else if (change >= 100) {
                int i = 0;
                i = change / 100;
                coins += i;
                change = change - (i * 100);
            } else if (change >= 50) {
                int i =0;
                i = change / 50;
                coins += i;
                change = change - (i * 50);
            }else if (change >= 20) {
                int i = 0;
                i = change / 20;
                coins += i;
                change = change - (i * 20);
            }else if (change >= 10) {
                int i = 0;
                i = change / 10;
                coins += i;
                change = change - (i * 10);
            }else if (change >= 5) {
                int i = 0;
                i = change / 5;
                coins += i;
                change = change - (i * 5);
            }else if (change >= 2) {
                int i = 0;
                i = change / 2;
                coins += i;
                change = change - (i * 2);
            }else if (change >= 1) {
                int i = 0;
                i = change / 1;
                coins += i;
                change = change - (i * 1);
            }
        }
        System.out.println(coins);
    }
}
