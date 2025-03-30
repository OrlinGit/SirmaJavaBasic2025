import java.util.Scanner;

public class Task17_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage score:");
        int percentage = Integer.parseInt(sc.nextLine());
        String score = "";
        if (percentage <= 59){
            score = "F";
        } else if (percentage <= 69) {
            score = "D";
        } else if (percentage <= 79) {
            score = "C";
        } else if (percentage <= 89) {
            score = "B";
        } else if (percentage <= 100) {
            score = "A";
        }
        System.out.println(score);
    }
}
