import java.util.Scanner;

public class Task5_DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of day:");
        int day = Integer.parseInt(sc.nextLine());
        String result = "";
        if (day < 1 || day > 7){
            result = "Error";
        }else{
            if (day == 1){
                result = "Monday";
            }else if (day == 2){
                result = "Tuesday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 4) {
                result = "Thursday";
            }else if (day == 5){
                result = "Friday";
            } else if (day == 6) {
                result = "Saturday";
            } else if (day == 7) {
                result = "Sunday";
            }
        }
        System.out.println(result);
    }
}
