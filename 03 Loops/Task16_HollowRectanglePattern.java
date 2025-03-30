import java.util.Scanner;

public class Task16_HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of columns:");
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print('*');
                }
            }else if(i > 0 && i < n - 1){
                for (int j = 0; j < m; j++) {
                    if (j == 0 || j == m - 1){
                        System.out.print('*');
                    }if (j > 0 && j < m - 1){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
