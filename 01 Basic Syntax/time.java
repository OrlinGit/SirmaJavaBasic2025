import  java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes:");
        int minutesInput = Integer.parseInt(sc.nextLine());

        int hours = minutesInput / 60;
        int minutes = minutesInput % 60;

        System.out.printf("%02d:%02d", hours, minutes);
    }
}
