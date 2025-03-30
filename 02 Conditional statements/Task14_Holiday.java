import java.text.DecimalFormat;
import java.util.Scanner;

public class Task14_Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vacation budget:");
        double budget = Double.parseDouble(sc.nextLine());
        System.out.println("Enter season to go on vacation:");
        String season = sc.nextLine();
        String destination = "";
        String typeOfVacation = "";
        double expences = 0.0;
        if (budget <= 100.0){
            destination = "Bulgaria";
            if(season.equals("summer")){
                typeOfVacation = "Camp";
                expences = 0.3 * budget;
            } else if (season.equals("winter")) {
                typeOfVacation = "Hotel";
                expences = 0.7 * budget;
            }
        } else if (budget <= 1000.0) {
            destination = "Europe";
            if(season.equals("summer")){
                typeOfVacation = "Camp";
                expences = 0.4 * budget;
            } else if (season.equals("winter")) {
                typeOfVacation = "Hotel";
                expences = 0.8 * budget;
            }
        } else if (budget > 1000.0) {
                destination = "Asia";
                expences = 0.9 * budget;
                typeOfVacation = "Hotel";
            }
        DecimalFormat format = new DecimalFormat("0.00");
        String expencesRounded = format.format(expences);
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s – %s", typeOfVacation, expencesRounded);
    }
}

