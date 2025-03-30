import java.util.Scanner;

public class Task8_AlarmAfter15minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours:");
        int hoursInput = Integer.parseInt(sc.nextLine());
        System.out.println("Enter minutes");
        int minutesInput = Integer.parseInt(sc.nextLine());
        int minutesForAlarm = (hoursInput * 60) + minutesInput + 15;
        int hoursAlarm = minutesForAlarm / 60;
        int minutesAlarm = minutesForAlarm % 60;
        if (hoursAlarm > 23){
            hoursAlarm = 0;
        }
        System.out.printf("%02d:%02d", hoursAlarm, minutesAlarm);
    }
}
