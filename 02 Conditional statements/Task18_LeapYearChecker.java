import java.util.Scanner;

public class Task18_LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = Integer.parseInt(sc.nextLine());
        String output = "";
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    output = "It‘s a leap year!";
                }else{
                    output = "It‘s not a leap year.";
                }
            }else{
                output = "It‘s a leap year!";
            }
        } else {
            output = "It‘s not a leap year.";
        }
        System.out.println(output);
    }
}
